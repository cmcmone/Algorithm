import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 * @version 1.00 May 23, 2020
 * @author Ray Chen
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        var map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i = 0, j = 1; j < s.length(); i++, j++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(j))) {
                res += map.get(s.charAt(i));
            } else {
                res -= map.get(s.charAt(i));
            }
        }
        return res + map.get(s.charAt(s.length() - 1));
    }
}
// @lc code=end
