package Practice;

public class index1 {

	public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        index1 solution = new index1();

        String haystack1 = "sadbutsad";
        String needle1 = "but";
        System.out.println(solution.strStr(haystack1, needle1)); // Output: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(solution.strStr(haystack2, needle2)); // Output: -1
    }
}