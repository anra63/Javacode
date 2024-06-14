package Practice;

public class ReverseStr {
	
	public static void main(String[] args) {
		
		String input = ("anu");
		String rev = "";
		for(int i =0; i < input.length() ; i++) {
		char ch = input.charAt(i);
		rev = ch+rev;
	}
System.out.println(rev);
}
}