import java.util.*;
class Loss{
	public static void main(String args[]){
		Scanner p=new Scanner(System.in);
		int sp=p.nextInt();
		int cp=p.nextInt();
		if(sp>cp)
			System.out.println("Profit of "+(sp-cp));
		else if(cp>sp)
			System.out.println("Loss of "+(cp-sp));
		else
			System.out.println("Na nafa na tota !!!");
		}
}
