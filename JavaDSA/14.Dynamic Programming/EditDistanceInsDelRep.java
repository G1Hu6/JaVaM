class EditDistanceInsDelRep{

    // (2).Given two strings, convert string1 one into string2 using minium operation cost.
    //     Insert a char = INS = 2
    //     Delete a char = DEL = 2
    //     Replace a char = REP = 3

    int editDisRecursion(char[] s1, char[] s2, int i, int j, int INS, int DEL, int REP){

        // base case
        if(i == 0){
            // insert j letters in s1.
            return INS * j;
        }

        if(j == 0){
            // delete i letters from s1
            return DEL * i;
        }
        
        //recursive case
        if(s1[i - 1] == s2[j - 1]){
            return editDisRecursion(s1, s2, i - 1, j - 1, INS, DEL, REP);
        }

        // insert
        int insertCost = INS + editDisRecursion(s1, s2, i, j - 1, INS, DEL, REP);
        // delete
        int deleteCost = DEL + editDisRecursion(s1, s2, i - 1, j, INS, DEL, REP);
        // update
        int replaceCost = REP + editDisRecursion(s1, s2, i - 1, j - 1, INS, DEL, REP);

        return Math.min(insertCost, Math.min(deleteCost, replaceCost));
    }



    public static void main(String[] args){

        EditDistanceInsDelRep obj = new EditDistanceInsDelRep();

        char[] s1 = {'a', 'b', 'd', 'x', 'y', 'l'};
        //char[] s1 = {'a', 'b', 'c', 'd'};
        char[] s2 = {'a', 'b', 'c', 'g', 'x', 'l'};
        //char[] s2 = {'a', 'b', 'e'};
        
        int ans1 = obj.editDisRecursion(s1, s2, s1.length, s2.length, 2, 2, 3);
        System.out.println("Min cost Recursion :- " + ans1);
    }
}
