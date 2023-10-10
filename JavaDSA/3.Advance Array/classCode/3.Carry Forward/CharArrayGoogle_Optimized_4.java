class Google{
	static int countPair(char arr[], int n){
		int count = 0;
		int pair = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] == 'a'){
				count++;
			}else if(arr[i] == 'g'){
				pair = pair + count;
			}
		}
		return pair;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                char arr[] = new char[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.next().charAt(0);
                }

		System.out.println("Count = " + countPair(arr, size));
	}	
}
