package GreedyApproach;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int ch = g.length;
        int co = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int con = 0;
        while(i<ch && j<co) {
            if(s[j]>= g[i]) {
                con++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return con;
        
    }
}
