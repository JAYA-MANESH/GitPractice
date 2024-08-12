package basic_programs;

public class factorial_of_each_digit_in_number {
	public static void main(String[] args) {
		int no=123;
		while(no>0) {
			int last = no%10;
			for(int i=1;i<=last;i++) {
				if(last%i==0) {
					System.out.println(i);
					
				}
				
			}
			System.out.println("the factors are");
			no=no/10;
		}
	}

}
