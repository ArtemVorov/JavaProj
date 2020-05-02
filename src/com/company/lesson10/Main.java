package com.company.lesson10;

import java.util.Arrays;

// a[40]
// arr[0[30]1[0]2[0][0][0][0][20][0][0]9[0]]
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 432, 5, 34, 324, 2363};
        String[] arrStr = new String[]{"32, 432, 5, 34, 324", "2363"};
//        arr[0] = 30;
//        arr[6] = 20;
//        System.out.println(arr.toString());
//        System.out.println(arr[0]);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 9 - i;
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        int[][] array = new int[2][3];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
