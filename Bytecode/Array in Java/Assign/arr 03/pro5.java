import java.io.*;
class Pro5{
        public static void main(String[]p)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int size=Integer.parseInt(br.readLine());
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
                //Pro2 obj=new Pro2();
                for(int i=0;i<arr.length;i++){
                        int sum=0;
                        for(int j=1;j<arr[i];j++){
                                if(arr[i]%j==0){
                                	sum=sum+j;        
                                }
                        }
                        if(sum==arr[i]){
                                System.out.println("Perfect no "+arr[i]+" at index "+ i);
                        }
                }
                }
}

