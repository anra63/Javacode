package Practice;

public class FrequentValue {

	public static void main(String[] args) {
		int[] val = {1,1,2,3,3,4,2,1};
		int max_val = 0;
		int ele = 0;
		for(int i = 0; i < val.length; i++) {
			int count = 1;
			for(int j = i+1; j < val.length; j++) {
				if( val[i] == val[j]) {
					count++;
				}
			}
			if(max_val < count) {
				max_val = count;
				ele = val[i];
			}
		}
		System.out.println(ele + " count " +  max_val  + " time");
	}

}
