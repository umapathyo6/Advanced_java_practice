package Interfaces_types;

interface Advance1{
	default void show() {
		System.out.println(" default Show");
	}
	static void display() {
		System.out.println("Static show");
	}
	
}
class wiered implements Advance1	{
	
}


public class java_version8_interface_advanced {
	
	
	public static void main(String[] args) {
		
		wiered obj1=new wiered();
		obj1.show();
		Advance1.display();
		
	}

}


//                    advanced interface in java 8
//*private void message() {

//System.out.println("Private Method");

//}

// Private static method
//private static void print() {

//System.out.println("Private Static Method");*//
