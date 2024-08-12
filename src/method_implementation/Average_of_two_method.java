package method_implementation;

import java.util.Scanner;
public class Average_of_two_method {

	public static int average_of_two(int a, int b) {
		int avg = (a + b) / 2;
		return avg;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2st number");
		int b=sc.nextInt();
		
		System.out.println(average_of_two(a, b));
	}

}
