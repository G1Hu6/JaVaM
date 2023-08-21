import java.util.*;

class Project implements Comparable{
	String proName = null;
	int teamSize = 0;
	int duration = 0;

	Project(String proName,int teamSize,int duration){
		this.proName = proName;
		this.teamSize = teamSize;
		this.duration = duration;
	}

	public int compareTo(Object obj){
		return proName.compareTo(((Project)obj).proName);
	}

	public String toString(){
		return "{" + proName + ":" + duration + "}";
	}
}

class PQComparableDemo{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();

		/*pq.offer(new Project("D",1,5));
		pq.offer(new Project("A",4,6));
		pq.offer(new Project("B",2,7));
		*/
		pq.add(new Project("D",1,5));
                pq.add(new Project("A",4,6));
                pq.add(new Project("B",2,7));
		
		System.out.println(pq.comparator());
		System.out.println(pq);
	}
}
