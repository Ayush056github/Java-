class Solution {
    public static int minCost(int[] arr) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
         for (int ele : arr) {
            pq.add(ele);
        }

        int cost = 0;

        while (pq.size() > 1) {

            int s1 = pq.poll();
            int s2 = pq.poll();

            int  sum = s1 + s2;

            cost += sum;

            pq.add(sum);
        }

        return cost;
    }
}
