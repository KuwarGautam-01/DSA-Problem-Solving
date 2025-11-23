package arrays;

import java.util.ArrayList;

public class MaxMinInArray {

    public static ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        result.add(min);
        result.add(max);

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, -5, -4, 8, 6};

        System.out.println(getMinMax(arr));  
        // Output: [-5, 8]
    }
}


//problem link: https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1