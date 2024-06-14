package Practice;


import java.util.HashSet;

import java.util.Set;

public class CommenElementsArr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,2};
		int[] arr1 = {2,6,7,3,8};
		//int a = arr.length;
		//int b = arr1.length;
		
		Set<Integer> m = new HashSet<Integer>(); 
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					m.add(arr[i]);
					
				}
			}
			
		}
		System.out.println(m);

	}

}
