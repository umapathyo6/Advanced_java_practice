package Colletions_Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> o1=new PriorityQueue<>();
		o1.offer(12);
		o1.offer(13);
		o1.offer(134);
		
		o1.offer(123);
		o1.offer(23);
		o1.offer(7);
		o1.offer(7);
		
		System.out.println(o1);
		System.out.println(o1.peek());
		o1.poll();
		System.out.println(o1);
		o1.remove(7);
		System.out.println(o1);
		
		
		
	}
	
	
	

}
