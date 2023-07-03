abstract class Match{
	void matchInfo(){
		System.out.println("T20/Test/OneDay");
	}

	abstract void ballColor();
}
class TestMatch extends Match{
	void ballColor(){
		System.out.println("Red Ball");
	}
}
class Client{
	public static void main(String[] args){
		Match icc=new TestMatch();
		icc.matchInfo();
		icc.ballColor();
	}
}
