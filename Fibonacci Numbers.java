import java.util.*;
class Solution {
    public int fib(int n) {
      if(n<=0)return n;

      return  nfb(n-1)+nfb(n-2);
      
    }
}
