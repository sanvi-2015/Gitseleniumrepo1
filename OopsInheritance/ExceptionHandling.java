package OopsInheritance;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
/*System.out.println("Programme starts");
		try {
			System.out.println("inside the try block");
			int a = 20 / 0;
			System.out.println("a");

		} catch (ArithmeticException e) {
			System.out.println("Exception Handeled");
			System.out.println(e);
		} finally {
			System.out.println("finlly block is always Executed");
		}
		System.out.println("programms ends");
		*/
		
		
		System.out.println("Programme Starts");
		Scanner scn = new Scanner(System.in);
		System.out.println("iam a array size");
		//int size = scn.nextInt();
		//int a[]=new int[3];
		try {
			
		//	int size = scn.nextInt();
			int a[]=new int[3];
			System.out.println(a);
			
		}
		catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("catch block starts from here");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
	}

}
