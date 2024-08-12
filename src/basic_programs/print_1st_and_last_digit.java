package basic_programs;

public class print_1st_and_last_digit {

	
	public static void main(String[] args) {
		int no=789450;
		int last_digit=no%10;
		
		while(no>9) {
			no=no/10;
		}
		
		System.out.println("first_number "+no);
		System.out.println("last_number "+last_digit);
	}
	

}
