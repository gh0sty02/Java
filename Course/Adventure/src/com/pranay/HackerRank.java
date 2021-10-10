package com.pranay;

import java.util.*;

public class HackerRank {
    public static void main(String[] args) {

//        List<Integer> ar = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
//        int n = 9;

//        System.out.println(pageCount(6,2));

//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();

        String ch = "mada";
//        char[] arr = ch.toCharArray();
//
//        int start = 0;
//        int end = arr.length - 1;
//        while(start < end){
//            char temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//
//        System.out.println(new String(arr));

        String str = "Helloworld";
        char[] charArr = str.toCharArray();
        int start = 3;
        int end = 7;
        StringBuilder s = new StringBuilder();
        for (int i = start; i < end; i++) {
            s.append(charArr[i]);
        }

        System.out.println(s.toString());

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> socks = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int curr = ar.get(i);
            if(socks.contains(curr)){
                socks.remove(curr);
                count++;
            }else{
                socks.add(curr);
            }
        }

        return count;
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        int totalTurns = n / 2;
        int leftToRight = p/ 2;
        int rightToLeft = totalTurns - leftToRight;

        return Math.min(leftToRight, rightToLeft);

    }
}
