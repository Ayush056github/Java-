// 
class Solution{
  public long minimumSteps(String s) {
    int n =s.length();
    int last = 0;
    int swapcount =0;

    for(int curr = 0 ; curr<n;curr++){
      if(s.charAt(curr)=='1'){
        swapcount+=(curr-last);
        last++;
      }
    }
    return swapcount;
  }
}
