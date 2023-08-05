class Outer{
    Outer gun(){
        System.out.println("In Outer Fun");
	return new Object();
    }
}
class Client {
    public static void main(String[] args) {
        Outer obj=new Outer(){
            String gun(){
	    	System.out.println("In Annonymus Inner Gun");
		return new String();
	    }
            Outer fun(){
                System.out.println("In Annonymus Inner Fun");
                return new Outer(){
		}.gun();
            }
        }.fun();
        obj.gun();
    }
}

