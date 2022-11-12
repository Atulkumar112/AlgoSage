class MedianFinder {

    PriorityQueue<Integer> minpq; 
    PriorityQueue<Integer> maxpq; 
    
    public MedianFinder() {
           this.minpq = new PriorityQueue<>();
           this.maxpq = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxpq.isEmpty() || maxpq.peek()>num){
            maxpq.add(num);
        }
        else{
            minpq.add(num);
        }
        
        if(maxpq.size() > minpq.size()+1){
            minpq.add(maxpq.poll());
        }
        else if(minpq.size() > maxpq.size()+1){
            maxpq.add(minpq.poll());
        }
    }
    
    public double findMedian() {
        if(maxpq.size() == minpq.size()){
            return (maxpq.peek() + minpq.peek())/2.0;
        }
        else{
            if(maxpq.size() > minpq.size()){
                return maxpq.peek();
            }
            else{
                return minpq.peek();
            }
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
