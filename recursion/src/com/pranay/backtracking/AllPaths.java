package com.pranay.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
            boolean[][] arr = {
                    {true, true, true},
                    {true, true, true},
                    {true, true, true}
            };

            int[][] path = {{0,0,0}, {0,0,0}, {0,0,0}};

        allPathsPrint("", 0,0,arr, path, 1);
    }

    static void allPaths(String p,boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1 ){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // making the change, ie marking the visited cell as false
        maze[r][c] = false;

        if(r < maze.length - 1){
            allPaths(p + 'D',maze, r+1, c);
        }
        if(c < maze[0].length - 1){
            allPaths(p+'R',maze, r , c +1 );
        }

        if(r > 0){
            allPaths(p + "U", maze, r - 1, c);
        }
        if(c > 0){
            allPaths(p + "L", maze, r, c - 1);
        }
        //reverting the change
        // so now as the function will get returned, we need to revert the changes
        // ie mark the cell as true

        maze[r][c] = true;
    }

    static void allPathsPrint(String p, int r, int c,boolean[][] maze, int[][] path, int step ){
        if(r== maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allPathsPrint(p+ 'D', r + 1, c, maze, path, step + 1);
        }
        if(c < maze[0].length - 1){
            allPathsPrint(p + 'R', r, c+1, maze, path, step + 1);
        }
        if(r > 0){
            allPathsPrint(p + 'U', r - 1, c, maze, path, step + 1);
        }
        if(c > 0){
            allPathsPrint(p + 'L', r , c - 1, maze, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;

    }
}
