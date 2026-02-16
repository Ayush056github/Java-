// 
class Number implements Comparable<Number>{
        int element;
        int Frequent;

        Number(int element , int Frequent){
            this.element = element;
            this.Frequent = Frequent;

        }
        public int compareTo(Number that){
            return that.Frequent-this.Frequent;
        }
    }
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for(int element : nums){
            freqmap.put(element,freqmap.getOrDefault(element,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freqmap.entrySet()){
            Number number = new Number(entry.getKey(),entry.getValue());
            pq.offer(number);
        }
        int[] result =  new int[k];
        int index = 0;
        while(index<k){
            Number number = pq.poll();
            result[index] = number.element;
            index++;
        }
        return result;
        
    }
}
