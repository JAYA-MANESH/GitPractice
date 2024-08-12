package basic_programs;

public class validate_number_count {
	
	public static void main(String[] args) {
		long l=12345;
		int count=0;
		while(l>0) {
			l=l/10;
			count++;
		}
		System.out.println("total count "+count);
		
		
	}

}
