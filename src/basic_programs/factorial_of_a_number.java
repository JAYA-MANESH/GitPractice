package basic_programs;

public class factorial_of_a_number {
	
	public static void main(String[] args) {
		int no=4;
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}
