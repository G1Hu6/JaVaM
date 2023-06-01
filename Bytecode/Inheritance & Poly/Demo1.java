class ICC{
    ICC(){
        System.out.println("In Icc Constructor");
    }
}
class BCCI extends ICC{
    BCCI(){
        System.out.println("In BCCI Constructor");
    }
}
class Client{
    public static void main(String args[]){
        BCCI jayShah=new BCCI();
    }
}
