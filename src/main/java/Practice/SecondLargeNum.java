package Practice;
public class SecondLargeNum {

	public static void main(String[] args) {
		int[] num  = {1,2,3,4,5,7,9};
		int max = num[0];
		int secondmax = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				secondmax = max;
				max = num[i];
			}
			
		}
		System.out.println(secondmax);
	}
	
}
