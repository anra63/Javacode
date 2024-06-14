package Practice;

public class palindromStr {

	public static void main(String[] args) {
		String input = "madan";
		String rev = "";
		for(int i =0; i < input.length(); i++) {
			char ch = input.charAt(i);
			rev = ch +rev;
		}
		if(input.equals(rev)) {
			System.out.println("It is a Palindrom");
		}else
			System.out.println("not a palindrom");
	}

}
