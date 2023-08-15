/*
import java.util.*;

class Movies{
	String movieName = null;
	float totalColl = 0.0f;

	Movies(String movieName,float totalColl){
		this.movieName = movieName;
		this.totalColl = totalColl;
	}

	public String toString(){
		return movieName;
	}
}

class TSComparableDemo{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();

		ts.add(new Movies("Gadar2",100.00f));
		ts.add(new Movies("OMG2",190.00f));
		ts.add(new Movies("Jailar",120.00f));

		System.out.println(ts);
	}
}

Exception in thread "main" java.lang.ClassCastException: class Movies cannot be cast to class java.lang.Comparable (Movies is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.TreeMap.compare(TreeMap.java:1291)
	at java.base/java.util.TreeMap.put(TreeMap.java:536)
	at java.base/java.util.TreeSet.add(TreeSet.java:255)
	at TSComparableDemo.main(RealtimeComparableDemo2.java:21)
*/


/*
import java.util.*;

class Movies implements Comparable{
        String movieName = null;
        float totalColl = 0.0f;

        Movies(String movieName,float totalColl){
                this.movieName = movieName;
                this.totalColl = totalColl;
        }

	public int compareTo(Object obj){
		//Assending order :
		//return movieName.compareTo(((Movies)obj).movieName);
		
		//Decending order :
		//return ((Movies)obj).movieName.compareTo(movieName);
		return -movieName.compareTo(((Movies)obj).movieName);
	}

        public String toString(){
                return movieName;
        }
}

class TSComparableDemo{
        public static void main(String[] args){
                TreeSet ts = new TreeSet();

                ts.add(new Movies("Gadar2",100.00f));
                ts.add(new Movies("OMG2",190.00f));
                ts.add(new Movies("Jailar",120.00f));

                System.out.println(ts);
        }
}

*/


import java.util.*;

class Movies implements Comparable<Movies>{
        String movieName = null;
        float totalColl = 0.0f;

        Movies(String movieName,float totalColl){
                this.movieName = movieName;
                this.totalColl = totalColl;
        }

        public int compareTo(Movies obj){
                //Assending order :
                return movieName.compareTo(obj.movieName);
        }

        public String toString(){
                return movieName;
        }
}

class TSComparableDemo{
        public static void main(String[] args){
                TreeSet<Movies> ts = new TreeSet<Movies>();

                ts.add(new Movies("Gadar2",100.00f));
                ts.add(new Movies("OMG2",190.00f));
                ts.add(new Movies("Jailar",120.00f));

                System.out.println(ts);
        }
}



/*
import java.util.*;

class Movies extends String{
        String movieName = null;
        float totalColl = 0.0f;

        Movies(String movieName,float totalColl){
                this.movieName = movieName;
                this.totalColl = totalColl;
        }

	/*
        public int compareTo(Movies obj){
                //Assending order :
                return movieName.compareTo(obj.movieName);
        } /*

        public String toString(){
                return movieName;
        }
}

class TSComparableDemo{
        public static void main(String[] args){
                TreeSet ts = new TreeSet();

                ts.add(new Movies("Gadar2",100.00f));
                ts.add(new Movies("OMG2",190.00f));
                ts.add(new Movies("Jailar",120.00f));

                System.out.println(ts);
        }
}

 RealtimeComparableDemo2.java:116: error: cannot inherit from final String
class Movies extends String{
                     ^
 */
