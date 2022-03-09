package com.XiShuai;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr  = new int[3];
        System.out.println(arr);
        arr[0] = 100;
        int[] arr2 = arr;
        System.out.println(arr);
        System.out.println(arr2);


    }
}
