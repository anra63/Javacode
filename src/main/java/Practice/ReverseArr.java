package Practice;

public class ReverseArr {

	public static void main(String[] args) {
		int[] input = {1,2,3,4};
		revArr(input);
		for(int i =0; i < input.length; i++)
		System.out.println(input[i]+ "");

	}
	public static void revArr(int[] array) {
		int i = 0; int j = array.length-1;
		while(i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
}
