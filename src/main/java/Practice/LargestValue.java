package Practice;

public class LargestValue {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 6, 8 };

		int large = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > large) {
				large = num[i];
			}
		}
		System.out.println(large);
	}

}
