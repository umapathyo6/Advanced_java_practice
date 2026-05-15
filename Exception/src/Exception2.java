class One{
	String a=null;
}

public class Exception2 {
	
	public static void main(String[] args) {
		
		One b=new One();
		
		try {
			System.out.print(b.a.length());
		}
		catch(Exception e) {
			System.out.println("null pointer");
		}
		System.out.print("program ends");
		
		
		
	}

}
