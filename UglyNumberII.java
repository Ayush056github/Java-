// 

import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {

        if(n==1)return n;

        int [] dp = new int[n];

        dp[0] = 1 ;

        int i2 = 0;
        int i3 = 0 ;
        int i5 = 0 ;

        for(int i = 1 ; i < n ; i++){
            int nextnumber2 = dp[i2]*2;
            int nextnumber3 = dp[i3]*3;
            int nextnumber5 = dp[i5]*5;

            dp[i] = Math.min(nextnumber2,Math.min(nextnumber3,nextnumber5));

            if(dp[i] == nextnumber2)i2++; 
            if(dp[i] == nextnumber3)i3++;
             if(dp[i] == nextnumber5)i5++;

        }
        return dp[n-1];
        
    }
}
