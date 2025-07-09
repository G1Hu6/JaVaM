class PatternMatchingProblem{

    int matchPattern(char[] text, char[] pattern, int i, int j){
        
        // base case
        if(i == 0 && j == 0){
            return true;
        }

        if(i == 0 && )
        // recursion case
        if(pattern[i] == '*'){
            return matchPattern(text, pattern, i-1, j) || matchPattern(text, pattern, i, j-1);
        }else if(pattern[i] == '?'){
            return matchPattern(text, pattern, i-1, j-1);
        }else{
            if(pattern[i] == text[j]){
                return matchPattern(text, pattern, i-1, j-1);
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args){

    }
}
