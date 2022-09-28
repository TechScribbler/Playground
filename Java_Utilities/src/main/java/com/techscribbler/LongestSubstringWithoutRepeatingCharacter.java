package com.techscribbler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacter longestSubstringWithoutRepeatingCharacter=new LongestSubstringWithoutRepeatingCharacter();
        System.out.println(longestSubstringWithoutRepeatingCharacter.lengthOfLongestSubstring("   "));
    }
    public static Boolean areDistinct(String str,int i, int j) {
        boolean[] visited = new boolean[1000];
        for(int k = i; k <= j; k++) {
            char val=String.valueOf(str.charAt(k)).toLowerCase().charAt(0);
            if(val=='\u0000'){
                return true;
            }

            System.out.println(' '- 'a');
            if (visited[val] == true)
                return false;
            visited[val] = true;
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        List<String> charList=new ArrayList<String>();
        int res=0;
        for(int i=0;i<s.length();i++) {
            for (int j = i; j < s.length(); j++) {
                if (areDistinct(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;

    }
}
