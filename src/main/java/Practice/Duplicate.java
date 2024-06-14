package Practice;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		int[] array = {1,2,1,3,4,5,2,2,5};
		List<Integer> org = new ArrayList<Integer>();
		List<Integer> dup = new ArrayList<Integer>();
		int count_org = 0;
		int count_dup = 0;
		for(int i = 0; i < array.length; i++) {
			if(!org.contains(array[i])) {
				org.add(array[i]);
				count_org++;
				
			}else 
				if(!dup.contains(array[i])) {
					dup.add(array[i]);
					count_dup++;
				}
				
				
			
		}
		System.out.println(org);
		System.out.println("org count " + count_org);
		System.out.println(dup);
		System.out.println("dup count " + count_dup);
		
	}

}
