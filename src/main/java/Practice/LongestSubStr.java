package Practice;

import java.util.HashMap;

public class LongestSubStr {

	public static void main(String[] args) {
		String str = "abcadefe";
		int m = lonestSubStr(str);
		System.out.println("longestSubstring length : " + m);
		

	}	
	public static  int lonestSubStr(String s) {
		int max_len = 0;
		int start =0;
		HashMap<Character, Integer> map = new HashMap();
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c) && map.get(c) >= start) {
				start = map.get(c)+1;
			}
			map.put(c, i);
			 int length = i - start + 1;
			 max_len = Math.max(max_len, length);
		}
		return max_len;
		
	}
	
}
