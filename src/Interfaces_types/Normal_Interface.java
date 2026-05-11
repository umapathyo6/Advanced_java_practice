package Interfaces_types;
class One{	
}
interface Normal{
	int a=10; //in interface normally a variable  take its as a (" public static final int a=10;");
	public   static final String b ="Umapathy";
	void show();//its default  take it as a abstract method like abstract void show();	
	
	
	}


 class Normal1 implements Normal{
	  public void show() {
		  System.out.println(" implements methods");
	  }
	 
	 
 }
public class Normal_Interface {	
	public static void main(String[] args) {
		Normal1 obj1=new Normal1();
		System.out.println(obj1.b);
		obj1.show();
						
	}


}

//interface is a similar to a class used to create a interface keyword;
//Eg interface interface_name{
//                                }
// insside interface all method  default take its a abstract method
// and the variable defaultly take its a ("public static Final datatype variable_name=10;")

//why interafce?
 //multiple inheritance not support the  java thats why use inyterface in same to extends one class and implements one interface
//eg 
class Umapathy extends One implements Normal{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}	
}
// this is called a normal interface;

