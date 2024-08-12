package online_programs;

public class Swapping_2_without {
	
	public static void main(String[] args) {
		int a=10; //20
		int b=20;
		System.out.println("before swap");
		System.out.println("a "+a);
		System.out.println("b "+b);
		
        a=a+b;
        b=a-b;
        a=a-b;
        		
		
		
		System.out.println("after swap");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}

}
