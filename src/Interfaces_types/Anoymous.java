package Interfaces_types;
interface OneFunction{
	void show() ;
		
}

public class Anoymous {
	
	
	
	
	public static void main(String[] args) {
		
		OneFunction f1=()->{
			System.out.print("umapathy1");
			
		};
		f1.show();
		
		
//or
		OneFunction f2=new OneFunction() {
			public void show() {
				System.out.println("Umapathy2");
			}
			
		};
		f2.show();
			}

}
