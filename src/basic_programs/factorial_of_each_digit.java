package basic_programs;

public class factorial_of_each_digit {
	public static void main(String[] args) {
		int no=123;
		while(no>0) {
			int last = no%10;
			no=no/10;
			int fact=1;
			for(int i=1;i<=last;i++) {
				fact=fact*i;
				
			}
			System.out.println("the factorial of "+last+" is "+fact);
			
		}
	}

}
