package Practice;

public class MissingNum {

	public static void main(String[] args) {
		int[] n = {1,3,4,5};
		int num = 0;
		for(int i = 0; i < n.length; i++) {
		num = num + n[i];
		
		}
		System.out.println(num);
		int num1 = 0;
		for(int j =0; j <= 5; j++) {
			num1 = num1 + j;
			
		}
		System.out.println(num1);
		System.out.println("Missing number : " + (num1 - num));
	}
	
}
