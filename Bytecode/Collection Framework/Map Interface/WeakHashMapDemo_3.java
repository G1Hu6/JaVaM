import java.util.*;

class Demo{
        String str;

        Demo(String str){
                this.str = str;
        }

        public String toString(){
                return str;
        }

        public void finalize(){
                System.out.println("notify...");
        }
}

class GCDemo{
        public static void main(String[] args){
                Demo obj1 = new Demo("c2w");
                Demo obj2 = new Demo("Inc");
                Demo obj3 = new Demo("Bin");

                WeakHashMap hs = new WeakHashMap();
                hs.put(obj1,2016);
                hs.put(obj2,2019);
                hs.put(obj3,2023);

                obj1 = null;
                obj2 = null;

                System.gc();    //call to Garbage Collector.

                System.out.println("In Main");
        }
}

