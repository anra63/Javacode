package Practice;


import java.util.Arrays;




public class Anagram {

	public static void main(String[] args) {
		String a = "heart";
		String b = "earth";
		
		char[] s = a.toCharArray();
		char[] s1= b.toCharArray();
		Arrays.sort(s);
		Arrays.sort(s1);
		
		if(Arrays.equals(s, s1)) {
			System.out.println("It is a anagram");
		}else 
			System.out.println("Not a Anagram");
		
	}

}
