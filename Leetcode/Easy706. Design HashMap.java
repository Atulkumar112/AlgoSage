// this solution is fine but according to the question we can't use any built inn function
// class MyHashMap {
//     HashMap<Integer, Integer> map;
//     public MyHashMap() {
//         map = new HashMap<>();
//     }
    
//     public void put(int key, int value) {
//         map.put(key, value);
//     }
    
//     public int get(int key) {
//         return map.get(key)!=null ? (int)map.get(key) : -1;
//     }
    
//     public void remove(int key) {
//         map.remove(key);
//     }
// }

//second approach

class MyHashMap {
    int[] data;
    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }
    public void put(int key, int val) {
        data[key] = val;
    }
    public int get(int key) {
        return data[key];
    }
    public void remove(int key) {
        data[key] = -1;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
