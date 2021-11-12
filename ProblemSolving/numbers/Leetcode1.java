package com.pranay;

import java.util.Arrays;
import java.util.*;

public class Leetcode1 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeDuplicate(nums, 2));
    }

    static int romanToInt(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('D', 100);
        put('M', 1000);
    }};
        System.out.println(m.get('I'));

        int res = 0; int i = 0;
        while (i < s.length()) {
            char curr = s.charAt(i);
            if (i + 1 < s.length()) {
                char next = s.charAt(i+1);
                System.out.println((curr));
                if (m.get(next) > m.get(curr)) {
                    res -= m.get(curr);
                    res += m.get(next);
                    i += 2;
                    continue;
                }
            }
            res += m.get(curr);
            i++;
        }
        return res;
    }

    static int removeDuplicate(int[] nums){
        int uniqueIndex = 0;
        for (int i = 1 ; i < nums.length ; i++) {
            if(nums[uniqueIndex] != nums[i]){
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1;
    }

    static int removeDuplicate(int[] nums, int target){
        int uniqueIndex = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != target){
//                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex ;
    }

}
