class Parent{
    Parent(){
        System.out.println("In Parents Constructor");
    }
    void parentPro(){
        System.out.println("Flat,car");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("In Child Constructor");
    }
}
class Demo3 {
    public static void main(String[] args) {
        Child obj1=new Child();
        Parent obj2=new Child();
        obj1.parentPro();
        obj2.parentPro();
    }
}
