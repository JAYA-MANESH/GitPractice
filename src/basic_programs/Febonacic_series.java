package basic_programs;

import java.util.Scanner;
public class Febonacic_series {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f1=0;
		int f2=1;
		int f3=0;
		System.out.println("Enter a Number");
		int no = sc.nextInt();
		for(int i=1;i<=no;i++) {
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
			System.out.println(f3);
		}
		
	}

}
