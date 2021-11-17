package com.pranay.problems;

public class Problems {
    public static void main(String[] args) {
        String s = "";

//        System.out.println(removeChar( "abacdae"));
        System.out.println(skipString( "abacdappleasa"));

    }

    static void removeCharacter(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            removeCharacter(p , up.substring(1));
        }else{
            removeCharacter(p + ch, up.substring(1));
        }
    }

    static String removeChar(String s){
        if(s.isEmpty()){
            return s;
        }
        if(s.charAt(0) == 'a'){
            return ""+ removeChar(s.substring(1));
        }else{
            return s.charAt(0) + removeChar(s.substring(1));
        }
    }
    static String skipString(String s){
        if(s.isEmpty()){
            return s;
        }
        if(s.startsWith("apple")){
            return skipString(s.substring(5));
        }else{
            return s.charAt(0) + skipString(s.substring(1));
        }
    }

}
