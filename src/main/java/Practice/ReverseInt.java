package Practice;

public class ReverseInt {
	
	public static void main(String[] args) {
		int input = 1234;
		int rev = 0;
		while(input!= 0) {
			rev = rev *10 + input % 10;
			input = input/10;
		}
		System.out.println(rev);
	}

}
