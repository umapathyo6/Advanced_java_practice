package Exception_basic;
import java.util.Scanner;
public class Exception3 {	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
				
			
		}
		try {
		System.out.println(a[3]);
		}
		catch(Exception e) {
			
		}
		System.out.println("program ends");
	}

}
