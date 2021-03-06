package com.jcohy.sample.algorithm.SimpleQuestion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最小最大数兑换
 */
public class Test_1044 {
    // tag::code[]
    public static void main(String[] args) {
        int[] arr = shuru();
        arr = sort(arr);
        outPut(arr);
    }

    private static void outPut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    private static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;

    }

    private static int[] shuru() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
    // end::code[]
}

