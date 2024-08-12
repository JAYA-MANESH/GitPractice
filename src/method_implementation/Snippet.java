package method_implementation;
import java.util.Scanner;
public class Snippet {
	
	public static double simpleInterest(double p,double t,double r) {
		  double interest=(p*t*r)/100;
		  return interest;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of P");
	double p=sc.nextDouble();
	System.out.println("Enter the value of T");
	double t=sc.nextDouble();
	System.out.println("Enter the value of R");
	double r=sc.nextDouble();
	
	System.out.println(simpleInterest(p,t,r));
		
	}
}

