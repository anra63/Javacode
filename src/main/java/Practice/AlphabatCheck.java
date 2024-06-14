package Practice;

import java.util.Scanner;

public class AlphabatCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the str");
		 String str = sc.nextLine();
		char[] c =  str.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
				System.out.println("Str contains Alphabet : " + c[i]);
			}else
				System.out.println("Str does not contains Alphabet : " + c[i]);
		}
	}

}