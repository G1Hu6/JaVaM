class Parent{
    Parent(){
        System.out.println("In Parents Constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("In Child Constructor");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Child obj1=new Child();
        Parent obj2=new Parent();
    }
}
