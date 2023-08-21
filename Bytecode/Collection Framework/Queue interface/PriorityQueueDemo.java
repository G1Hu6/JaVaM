// Priority Queue uses the Heap datastracture Internally.

import java.util.*;

class PQueueDemo{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();

		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);

		System.out.println(pq);	//Min Heap Algorithum

		PriorityQueue pq1 = new PriorityQueue();

                pq1.offer("C");
                pq1.offer("Y");
                pq1.offer("K");
                pq1.offer("Aa");
                pq1.offer("A");

                System.out.println(pq1); // not in alphabetical order.

	}
}
