class Solution {
    public int totalFruit(int[] tree) {
        int last_fruit=-1;
        int sec_last_fruit=-1;
        int last_fruit_count=0;
        int current_max=0;
        int max=0;

        for(Integer f: tree){
            if(f==last_fruit || f==sec_last_fruit){
                current_max+=1;
            }
            else{
                current_max=last_fruit_count+1;
            }

            if(f==last_fruit){
                last_fruit_count+=1;
            }
            else{
                last_fruit_count=1;
            }

            if(f!=last_fruit){
                sec_last_fruit=last_fruit;
                last_fruit=f;
            }

            max=Math.max(current_max, max);
        }
        return max;
    }
}
