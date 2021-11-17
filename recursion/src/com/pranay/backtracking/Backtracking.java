package com.pranay.backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
        boolean[][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestriction("",arr, 0,0);
//        System.out.println(pathArrDiagonal("",3,3));
    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static void path(String p, int r, int c){
        if(r==1 && c ==1 ){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'D', r-1, c);
        }
        if(c > 1){
            path(p+'R', r , c -1 );
        }
    }

    static ArrayList<String> pathArr(String p, int r, int c){
        if(r==1 && c ==1 ){
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        ArrayList<String> arr = new ArrayList<>();

        if(r > 1){
            arr.addAll(pathArr(p + 'D', r-1, c));
        }
        if(c > 1){
            arr.addAll(pathArr(p+'R', r , c -1 ));
        }

        return arr;
    }

    static void pathDiagonal(String p, int r, int c){
        if(r==1 && c ==1 ){
            System.out.println(p);
            return;
        }

        if(r > 1){
            pathDiagonal(p + 'V', r-1, c);
        }
        if(c > 1){
            pathDiagonal(p+'H', r , c -1 );
        }
        if(c > 1 && r > 1){
            pathDiagonal(p+'D', r-1 , c -1 );
        }
    }

    static ArrayList<String> pathArrDiagonal(String p, int r, int c){
        if(r==1 && c ==1 ){
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        ArrayList<String> arr = new ArrayList<>();

        if(r > 1){
            arr.addAll(pathArrDiagonal(p + 'V', r-1, c));
        }
        if(c > 1){
            arr.addAll(pathArrDiagonal(p+'H', r , c -1 ));
        }
        if(r > 1 && c > 1){
            arr.addAll(pathArrDiagonal(p+'D', r - 1 , c -1 ));
        }


        return arr;
    }

    static void pathRestriction(String p,boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1 ){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length - 1){
            pathRestriction(p + 'D',maze, r+1, c);
        }
        if(c < maze[0].length - 1){
            pathRestriction(p+'R',maze, r , c +1 );
        }
    }
}
