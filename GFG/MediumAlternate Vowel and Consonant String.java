class Solution{
    public String rearrange(String S, int N){
         if(S.length() == 1){
            return S;
        }
        int[] vo = new int[26];
        int[] co = new int[26];
        int cnt = 0;
        for(char x : S.toCharArray()){
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                vo[x - 'a']++;
                cnt++;
            }else{
                co[x - 'a']++;
            }
        }
        int count = N - cnt;
        if(Math.abs(cnt - count) > 1){
            return "-1";
        }
        int i = 0;
        int j = 0;
        int k = 0;
        StringBuilder str = new StringBuilder();
        boolean flag;
        if(cnt >= count){
            flag = true;
        }else{
            flag = false;
        }
        while(i < 26 && j < 26){
            while(i < 26 && vo[i] < 1){
                i++;
            }
            while(j < 26 && co[j] < 1){
                j++;
            }
            if(i >= 26 || j >= 26){
                break;
            }
            if(i < 26 && flag){
                str.append((char)('a' + i));
                str.append((char)('a' + j));
                vo[i]--;
                co[j]--;
            }else{
                str.append((char)('a' + j));
                str.append((char)('a' + i));
                vo[i]--;
                co[j]--;
            }
        }
        while(i < 26){
            while(i < 26 && vo[i] < 1){
                i++;
            }
            if(i == 26){
                break;
            }else{
                str.append((char)('a' + i));
                vo[i]--;
            }
        }
        while(j < 26){
            while(j < 26 && co[j] < 1){
                j++;
            }
            if(j == 26){
                break;
            }else{
                str.append((char)('a' + j));
                co[j]--;
            }
        }
        return str.toString();
    }
}
