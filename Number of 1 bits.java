// 
import java.util.*;
import java.util.Scanner;

class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            count += n % 2;
            n = n / 2;
        }
        return count;
    }
}
