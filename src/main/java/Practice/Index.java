package Practice;

public class Index {

	public static void main(String[] args) {
		int[] s = {1,2,3,4,5};
		int target = 4;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == target) {
				System.out.println(i);
			}
		}

	}

}
