package Practice;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollection {

	public static void main(String[] args) {
		int[] gar = {0,1,1,0,1,0,1};
		int count = 0;
		
		List<Integer> l = new ArrayList<>();
		for(int i = 0; i < gar.length; i++) {
			
			if(gar[i] == 1) {
				l.add(i);
				count++;
			}
		}
		System.out.println("No of Garbage : " + count);

	}

}
