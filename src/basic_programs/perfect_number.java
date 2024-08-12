package basic_programs;

public class perfect_number {
	
	public static void main(String[] args) {
		int a=2;
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum=sum+i;
			}
		}
		if(a==sum) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
		
	}

}
