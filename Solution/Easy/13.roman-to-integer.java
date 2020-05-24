/*
 * @lc app=leetcode id=13 lang=java
 * @version 1.02 May 23, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [13] Roman to Integer Number https://leetcode.com/problems/roman-to-integer/
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (getValue(s.charAt(i)) >= getValue(s.charAt(i + 1))) {
                res += getValue(s.charAt(i));
            } else {
                res -= getValue(s.charAt(i));
            }
        }
        return res + getValue(s.charAt(s.length() - 1));
    }

    private int getValue(char c){
        switch(c){
            case 'M' : return 1000;
            case 'D' : return 500;
            case 'C' : return 100;
            case 'L' : return 50;
            case 'X' : return 10;
            case 'V' : return 5;
            case 'I' : return 1;
            default : return 0;
        }
    }
}
// @lc code=end
