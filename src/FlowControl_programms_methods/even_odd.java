package FlowControl_programms_methods;

public class even_odd {

	public static String even_odd_check(int a) {
		if (a % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

	public static void main(String[] args) {
   System.out.println(even_odd_check(66));
	}

}
