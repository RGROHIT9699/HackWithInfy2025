package GreedyApproach;

import java.util.Arrays;

public class Buy_Two_Chocolates {

    public static void main(String[] args) {
        int[] arr = {69,91,78,19,40,13} ;
        int mo = 94;
        int[] arr1 = {98,54,6,34,66,63,52,39} ;
        int mo1 = 62;
        System.out.println(buyChoco(arr,mo));
        System.out.println(buyChoco(arr1,mo1));
    }
    public static int buyChoco(int[] arr, int mo) {
        Arrays.sort(arr);
        int s = mo - (arr[0] + arr[1]);
        if(s<0) {
            return mo;
        }
        return s;
    }
}
