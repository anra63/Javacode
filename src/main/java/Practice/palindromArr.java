package Practice;

public class palindromArr {

	public static void main(String[] args) {
		int[] input = {1,2,1,8};
		 PalArr(input);
		 //for(int i =0; i < input.length; i ++)
			// System.out.println(input[i]);
		

	}
	public static void PalArr(int[] array) {
		int i = 0; int j = array.length-1;
		while(i < j) {
			int temp = array[i];
			array[i] = array [j];
			array[j] = temp;
			i++;
			j--;
		}
		if (i != j) {
			System.out.println("not a palindrom array");
		}else 
			System.out.println("palindrom array");
	}

}
