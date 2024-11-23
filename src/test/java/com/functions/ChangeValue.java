package com.functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create a array
        int[] arr={1,5,45,8,6};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[]nums){
        nums[0]=99;
        System.out.println(nums[0]);
    }
}
