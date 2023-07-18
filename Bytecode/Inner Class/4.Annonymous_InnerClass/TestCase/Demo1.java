/*
class Outer{
    int fun(){
        System.out.println("In Outer Fun");
        return 10;
    }
}
class Client {
    public static void main(String[] args) {
        Outer obj=new Outer(){
            char fun(){
                System.out.println("In Outer Fun");
                return 'A';
            }
        };
        System.out.println(obj.fun());       //error: fun() in <anonymous Client$1> cannot override fun() in Outer 
    }
}
*/


class Outer{
    Object fun(){
        System.out.println("In Outer Fun");
        return new Object();
    }
}
class Client {
    public static void main(String[] args) {
        Outer obj=new Outer(){
            String fun(){
                System.out.println("In Annonymus Inner Fun");
                return "King";
            }
        };
        System.out.println(obj.fun());      
    }
}
