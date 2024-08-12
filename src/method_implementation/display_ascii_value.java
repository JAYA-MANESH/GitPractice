package method_implementation;

import java.util.Scanner;

public class display_ascii_value {

	public static void Ascii_value(char c) {
		System.out.println((int) c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		Ascii_value(ch);

	}

}
