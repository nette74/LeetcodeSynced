class KthLargest {

     int k;
     // kth;
     PriorityQueue<Integer> pq;
     public KthLargest(int k, int[] nums) {
         pq = new PriorityQueue<>(k);    
         this.k = k;
         for(int num : nums){
             if(pq.size() < k){
                 pq.add(num);   
             } else {
                 if(pq.peek() < num){
                     pq.poll();
                     pq.add(num);
                 }
             }
         }
     }

     public int add(int val) {
         if(pq.size() < k){
             pq.add(val);
         } else {
             if(pq.peek() < val){
                 pq.poll();
                 pq.add(val);
             }
         }
         return pq.peek();
     }
 }