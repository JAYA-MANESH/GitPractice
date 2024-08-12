package basic_programs;

public class odd_factors_of_number2 {
	
	public static void main(String[] args) {
		int a=10;
		for(int i=1;i<=a;i++) {
			if(a%i==0 && !(i%2==0)) {
				System.out.print( i+ "\n");
			}
		}
	}

}
