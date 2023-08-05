/*
class StackOverDemo{
	static void fun(int x){
		System.out.println(x);
		fun(++x);
	}
	public static void main(String[] args){
		fun(1);
	}
}
/*
Output :

1
2
3
.
.
.
~10660
Exception in thread "main" java.lang.StackOverflowException
	at sun.nio.cs.UTF_8$Encoder.encodeLoop(UTF_8.java:691)
	at java.nio.charset.CharsetEncoder.encode(CharsetEncoder.java:579)
	at sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:271)
	at sun.nio.cs.StreamEncoder.write(StreamEncoder.java:125)
	at java.io.OutputStreamWriter.write(OutputStreamWriter.java:207)
	at java.io.BufferedWriter.flushBuffer(BufferedWriter.java:129)
	at java.io.PrintStream.write(PrintStream.java:526)
	at java.io.PrintStream.print(PrintStream.java:597)
	at java.io.PrintStream.println(PrintStream.java:736)
	at StackOverDemo.fun(SOError.java:3)
	at StackOverDemo.fun(SOError.java:4)
	at StackOverDemo.fun(SOError.java:4)
	at StackOverDemo.fun(SOError.java:4)
	at StackOverDemo.fun(SOError.java:4)
	at StackOverDemo.fun(SOError.java:4)
	at StackOverDemo.fun(SOError.java:4)
		.....
		.....
		.....
		.....
 */






