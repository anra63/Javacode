package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "anupriya";
		char[] ch = name.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char chars: ch) {
			
			if(!map.containsKey(chars)) {
				map.put(chars, 1);
			
			}else {
			int count = map.get(chars);
					map.put(chars, count + 1);
				
		}
		
	}
		System.out.println(map);

} 
}
