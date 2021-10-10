package ru.dataart.academy.java;

import java.util.HashMap;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        if (checkString == null) {
            throw new IllegalArgumentException("Input string is null");
        }
        int len = checkString.length();
        if(len < 1) { return len; }

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for(int end = 0; end < len; end++) {
            char eChar = checkString.charAt(end);
            if(map.containsKey(eChar)) {
                start = Math.max(start, map.get(eChar) + 1);
            }
            map.put(eChar, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
