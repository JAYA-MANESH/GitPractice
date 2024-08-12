package basic_programs;

public class sum_of_each_factor_of_the_number {
	public static void main(String[] args) {
		int no = 15;
		int sum = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {

				sum = sum + i;
			}
		}

		System.out.println(sum);
	}

}
