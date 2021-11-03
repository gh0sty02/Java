package com.pranay;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Pranay";
        char target = 'a';
        System.out.println(search(str, target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }


//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) ==  target){
//                return true;
//            }
//        }

        // for each loop
        for(char i : str.toCharArray()){
            if(i == target){
                return true;
            }
        }

        return false;
    }
}
