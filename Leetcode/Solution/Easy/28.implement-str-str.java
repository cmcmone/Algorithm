/*
 * @lc app=leetcode id=28 lang=java
 * @version 1.00 May 27, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [28] Implement strStr()
 * - https://leetcode.com/problems/implement-strstr/
 * 
 * Approach 1: Brute Force
 * Approach 2: Boyer Moore Algorithm(Bad Character Heuristic)
 */

// @lc code=start
// Approach 1: Brute Force
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty()) return -1;

        int pos = 0;
        while (pos <= haystack.length() - needle.length()) {
            for (int i = needle.length() - 1; i >= 0 && haystack.charAt(pos + i) == needle.charAt(i); i--) {
                if (i <= 0) {
                    return pos;
                }
            }
            pos++;
        }
        return -1;
    }
}
/*
//Approach 2: Boyer Moore Algorithm(Bad Character Heuristic)
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        if (haystack.isEmpty())
            return -1;

        var badchar = new HashMap<Character, Integer>(needle.length());
        badCharHeuristic(needle, badchar);

        int pos = 0, len;
        while (pos <= haystack.length() - needle.length()) {
            for (len = needle.length() - 1; len >= 0 && haystack.charAt(pos + len) == needle.charAt(len); len--) {
                if (len <= 0) {
                    return pos;
                }
            }
            pos += Math.max(1, len - getValue(badchar, haystack.charAt(pos + len)));
        }
        return -1;
    }

    private int getValue(HashMap<Character, Integer> badchar, char c) {
        return badchar.get(c) == null ? -1 : badchar.get(c);
    }

    private void badCharHeuristic(String needle, HashMap<Character, Integer> badchar) {
        for (int i = 0; i < needle.length(); i++) {
            badchar.put(needle.charAt(i), i);
        }
    }
}
*/
// @lc code=end
