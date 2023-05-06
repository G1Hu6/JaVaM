class ArrHeap1{
        void fun(int arr[]){
                        arr[1]=7000;
                        arr[2]=8000;
        }

        public static void main(String []args){
                int arr[]={1000,2000,3000,4000};
                ArrHeap1 obj=new ArrHeap1();

                System.out.println(System.identityHashCode(arr[0]));
                System.out.println(System.identityHashCode(arr[1]));
                System.out.println(System.identityHashCode(arr[2]));
                System.out.println(System.identityHashCode(arr[3]));

                obj.fun(arr);
                for(int x:arr){
                        System.out.println(x);
                }
                System.out.println(System.identityHashCode(arr[1]));
                System.out.println(System.identityHashCode(arr[2]));

                int x=70;
                int y=80;

                System.out.println(System.identityHashCode(x));
                System.out.println(System.identityHashCode(y));

        }
}

