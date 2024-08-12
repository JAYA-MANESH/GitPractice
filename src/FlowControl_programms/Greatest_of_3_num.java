package FlowControl_programms;

public class Greatest_of_3_num {
	public static void main(String[] args) {
		int a=30;
		int b=88;
		int c=45;
		
		if(a>=b && a>=c) {
			System.out.println(a+" is big");
		}else if(b>=a &&b>=c) {
			System.out.println(b+" is big");
		}else
		{
			System.out.println(c+" is big");
		}
	}

}
