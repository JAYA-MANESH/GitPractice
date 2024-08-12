package method_implementation;

import java.util.Scanner;
public class Addition_program_method {
	
	public static int Addition_two(int a,int b) {
	   return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1s number");
		int a=sc.nextInt();
		
		System.out.println("Enter 2s number");
		
		int b=sc.nextInt();
		
		System.out.println(Addition_two(a, b));
		
	}

}
