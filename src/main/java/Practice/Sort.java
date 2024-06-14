package Practice;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,3,2,5,4};
		
		for(int i = 0; i < input.length; i++) {
			for(int j = i+1; j < input.length; j++) {
				if(input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
				
			}
			
		}
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		
	}

}
