package basic_programs;

public class factors_of_number {
	
	public static void main(String[] args) {
		int a=10;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(" "+ i);
			}
		}
	}

}
