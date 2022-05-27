/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

* */

import java.util.ArrayList;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String[] inputs = {
                "leetcode",
                "loveleetcode",
                "aabb"
        };
        for(var s: inputs) {
            int index = indexOfFirstNonRepeatingChar(s);
            System.out.println(s + " : " + index);
        }
    }

    static int indexOfFirstNonRepeatingChar(String s) {
        ArrayList<Character> repeatingLetters = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!repeatingLetters.contains(c)) {
                int j = i+1;
                while(j < s.length()) {
                    if(s.charAt(i) == s.charAt(j)) {
                        repeatingLetters.add(s.charAt(i));
                        break;
                    }
                    j++;
                }
                if(j == s.length())
                    return i;
            }
        }
        return -1;
    }
}
