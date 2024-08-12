package method_implementation;

import java.util.Scanner;
public class Total_Avg_of3_method {

	public static int Total(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	public static int average_of_3(int a, int b, int c) {
		int Total = a + b + c;
		int avg = (Total / 3);
		return avg;

	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1 number");
    int a=sc.nextInt();
    System.out.println("enter 2 number");
    int b=sc.nextInt();
    System.out.println("enter 3 number");
    int c=sc.nextInt();
    
    System.out.println("Total "+Total(a,b,c));
    System.out.println("average "+average_of_3(a,b,c));
	}
}
