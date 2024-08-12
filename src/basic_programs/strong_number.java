package basic_programs;

public class strong_number {
	public static void main(String[] args) {
		int no=155;
		int no1=no;
		int sum=0;
		while(no>0) {
			int last = no%10;
			 no=no/10;
			int fact=1;
			for(int i=1;i<=last;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
		}
		
		if(no1==sum) {
			System.out.println("it is strong number");
		}else {
			System.out.println("not a strong number");
		}
	}

}
