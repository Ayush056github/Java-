// 
import java.util.*;

class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0; i <= num; i++){
            if(i + rev(i,0) == num) return true;
        }
        return false;
    }

    int rev(int n, int r){
        if(n == 0) return r;
        return rev(n/10, r*10 + n%10);
    }
}
// “% last digit deta hai, / last digit hatata hai, *10 jagah banata hai.”  Is Method Yaad Rakhna hai .
