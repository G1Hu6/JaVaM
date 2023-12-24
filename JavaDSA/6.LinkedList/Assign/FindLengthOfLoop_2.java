/*
 2.Find length of Loop

 -Given a linked list of size N. The task is to complete the function countNodesinLoop() that
  checks whether a given Linked List contains a loop or not and if the loop is present then return
  the count of nodes in a loop or else return 0. C is the position of the node to which the last node
  is connected. If it is 0 then no loop.

Example 1:
Input:
N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C=4
Output: 7
Explanation: The loop is 45->33. Solength of loop is 33->10->21->39->
90->58->45 = 7. The number 33 is
connected to the last node to form the
loop because according to the input the
4th node from the beginning(1 based
index) will be connected to the last
node for the loop.

Example 2:
Input:
N=2
value[] = {1,0}
C=1
Output: 2
Explanation: The length of the loop
is 2.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 500
0 <= C <= N-1

*/

class FindLengthOfLoop{
	
	class Node{
		
		Node head = null;
		int data;

		Node(int data){
			
			this.data = data;
		}
	}

	Node head = null;

	void addLast(int data){
		
		Node newNode = new node(data);
		if(head == null){
			
			head = newNode;
		}else{

			Node temp = head;
			if(temp.next != null){

				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	void countNode(){
		
		int count = 0;
		temp Node = head;
		if(temp.next != null){
		
			temp = temp.next;
			count++;
		}

		return count;
	}

	void printSLL(){
		if(head == null){

			System.out.println("LinkedList is Empty!!!");
		}else{

			Node temp = head;
			while(temp != null){

				if(temp.next == null){

					System.out.print(temp.data);
				}else{

					System.out.print(temp.data + " -> ");
				}
				temp = temp.next;
			}
			System.out.println();
		}
	}

	int countNodeInLoop(int loopPos, int len){
		if(loopPos > len || head == null){

			return 0;
		}
		return (len - loopPos + 1);
	}

}


class Client{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of LinkedList :");
		int n = sc.nextInt();

		System.out.println("Enter elements of LinkedList :");
		for(int i = 0; i < n; i++){
			
			int data = sc.nextInt();
			ll.addLast(data);
		}

		System.out.println("Enter position of Loop :");
		int c = sc.nextInt();

		System.out.println("Total elements in Loop : " + ll.countNodeInLoop(c , n);
	}
}































