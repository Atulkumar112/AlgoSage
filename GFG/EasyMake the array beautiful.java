// we can do this  question using stack just try to your self
class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
       // code here
        int n = arr.length;
      ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
        //    arr[i]=sc.nextInt();
            list.add(arr[i]);
        }
        
        while(list.size()>0) {
            boolean flag = false;
            for(int i=0;i<list.size()-1;i++) {
                int t1 = list.get(i);
                int t2 = list.get(i+1);
                if((t1<0 && t2>=0) || (t1>=0 && t2<0)) {
                    list.remove(i);
                    list.remove(i);
                    flag = true;
                    break;
                }    
            }
            if(!flag) {
                break;
            }
        }
        
        //System.out.println(list);
        return list;
    }
}
