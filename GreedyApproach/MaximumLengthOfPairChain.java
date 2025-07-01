package GreedyApproach;

import java.util.Arrays;

public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs,(a,b)->(a[1]-b[1]));
        int count = 0;
        int j = Integer.MIN_VALUE;
        for(int[]i : pairs) {
            if(j< i[0]){
                j = i[1];
                count++;
            }
        }
        return count;
    }    
}
