package com.pranay;

public class Count {
    public static void main(String[] args) {
        int num = 2222233;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == 2){
                count++;
            }
            num /=10;
        }

        System.out.println(count);
    }
}
