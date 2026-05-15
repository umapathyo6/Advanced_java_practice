package Colletions_list;

import java.util.Vector;

public class VectorList {
	
	
	
	
	public static void main(String[] args) {
		Vector<Object> v1=new Vector<>();
		Vector<Integer> v2=new Vector<>();
		Vector<Double> v3=new Vector<>();
		Vector<String> v4=new Vector<>();
	}
	//array list simaailar to vector
	// almost all method use same arraylist and vector
	//both are natural growable but use differt formula 
	//one difference is vector is thread safe and slower than arraylist
	//thread safe means == multile thread comes to list vector automatically protects the data but in arraylist loose data
	//to prefer to Array list
	// vector is relesed before collection java1.2
	//array list is java1.2
	//Both ArrayList and Vector:

	/*
	 * ✅ use almost same methods ✅ grow automatically ✅ allow duplicates ✅ maintain
	 * insertion order ✅ support indexing
	 * 
	 * Main difference:
	 * 
	 * ArrayList Vector Not thread-safe Thread-safe Faster Slower No synchronization
	 * Synchronized Simple Meaning of Thread-Safe
	 * 
	 * If multiple threads access data at same time:
	 * 
	 * Vector
	 * 
	 * protects data automatically.
	 * 
	 * Vector<Integer> v = new Vector<>();
	 * 
	 * Internally synchronized.
	 * 
	 * ArrayList
	 * 
	 * does not protect automatically.
	 * 
	 * ArrayList<Integer> list = new ArrayList<>();
	 * 
	 * Multiple threads may cause problems.
	 * 
	 * Why Vector Slower?
	 * 
	 * Because every operation checks synchronization.
	 * 
	 * Example internally:
	 * 
	 * synchronized add()
	 * 
	 * That extra protection reduces speed.
	 * 
	 * Real-world Understanding ArrayList
	 * 
	 * Like:
	 * 
	 * single person using notebook fast access Vector
	 * 
	 * Like:
	 * 
	 * many people sharing same notebook lock system used safer but slower Final
	 * One-Line Difference
	 * 
	 * ✅ ArrayList = fast, non-thread-safe ✅ Vector = slower, thread-safe
	 */
	

}
