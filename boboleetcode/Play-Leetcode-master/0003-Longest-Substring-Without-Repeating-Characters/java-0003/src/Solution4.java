import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution4 {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int max = 0;
        for (int i=0,j=0; j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            max = Math.max(max,set.size());
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println((new Solution3()).lengthOfLongestSubstring( "abcabcbb" ));
        System.out.println((new Solution3()).lengthOfLongestSubstring( "bbbbb" ));
        System.out.println((new Solution3()).lengthOfLongestSubstring( "pwwkew" ));
        System.out.println((new Solution3()).lengthOfLongestSubstring( "" ));
    }
}
