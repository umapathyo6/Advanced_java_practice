package Colletions_list;

import java.util.ArrayList;

class One{
	ArrayList<Object> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	ArrayList<String> list3=new ArrayList<>();
	ArrayList<Double> list4=new ArrayList<>();
	One(){
		list1.add("UMApathy");
		list1.add(1);
		list1.add(3.8);
		list2.add(1);
		list2.add(2);
		
		list3.add("VIRAT KHOLI");
		list3.add("UMapathy");
		list4.add(1.8);
		
	}
}
public class ArrayList1{
	public static void main(String[] args) {
		One obj1=new One();
		System.out.println(obj1.list1);
		System.out.println(obj1.list2);
		System.out.println(obj1.list3);	
		System.out.println(obj1.list1.get(1));
		System.out.println(obj1.list2.get(1));
		System.out.println(obj1.list3.get(1));
		System.out.println(obj1.list1.size());	
		System.out.println(obj1.list2.set(0, 2));
		System.out.println(obj1.list2);
		System.out.println(obj1.list2.get(0));
		System.out.println(obj1.list1.set(0, "Umapathy"));
		System.out.println(obj1.list1);
		System.out.println(obj1.list2.remove("1"));
		System.out.println(obj1.list2);
		System.out.println(obj1.list1.lastIndexOf(1));
		System.out.println(obj1.list1.isEmpty());
		
		}
}


/* ARRAY IS FULL USE THESE formula== cc*3/2+1 */