package com.pranay;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,7,5};
        System.out.println(findIndex(arr, 3, 0));
        System.out.println(findIndexFromLast(arr, 3, arr.length - 1));
        findAllIndex(arr, 7, 0);
        System.out.println(list);
        System.out.println(findAllIndex(arr, 7, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 7, 0));
    }

    static boolean sorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index + 1);
        }

    }

    static int findIndexFromLast(int[] arr, int target, int index){
        if(index < -1){
            return -1;
        }
        if(arr[index] == target){
            return target;
        }else{
            return findIndexFromLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> previousAns = findAllIndex2(arr, target, index + 1);
        list.addAll(previousAns);
        return list;
    }


}
