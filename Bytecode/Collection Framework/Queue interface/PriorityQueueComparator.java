import java.util.*;

class Project{
        String proName = null;
        int teamSize = 0;
        int duration = 0;

        Project(String proName,int teamSize,int duration){
                this.proName = proName;
                this.teamSize = teamSize;
                this.duration = duration;
        }

        public String toString(){
                return "{" + proName + ":" + duration + "}";
        }
}

class SortByDuration implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((((Project)obj1).duration) - (((Project)obj2).duration));
	}
}
class PQComparatorDemo{
        public static void main(String[] args){
                PriorityQueue pq = new PriorityQueue();
		//ArrayList pq = new ArrayList(new SortByDuration());
		
		/*
                pq.offer(new Project("InstagramClone",10,30));
                pq.offer(new Project("Lusi",40,90));
                pq.offer(new Project("Macintosh",90,60));
		*/
		pq.add(new Project("I",10,30));
                pq.add(new Project("L",40,90));
                pq.add(new Project("M",90,60));
	
		Comparator cmp = pq.comparator(); 
		//Collections.sort();
                System.out.println(pq);
        }
}

