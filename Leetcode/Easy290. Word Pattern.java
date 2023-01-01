class Solution {
    public boolean wordPattern(String pattern, String s) {
        // below is my code and it's running 31/37 TC
        // Map<Character, Integer> mapP = new HashMap<>();
        // Map<String, Integer> mapS = new HashMap<>();
        
        // for(int i=0; i<pattern.length(); i++){
        //     mapP.put(pattern.charAt(i), mapP.getOrDefault(pattern.charAt(i), 0)+1);
        // }
        // String[] str = s.split(" ");

        // if(str.length != pattern.length()){
        //     return false;
        // }
        // for(int i=0; i<str.length; i++){
        //     mapS.put(str[i], mapS.getOrDefault(str[i], 0)+1);
        // }
        
        // int[] arr = new int[pattern.length()];
        // int j=0;
        // for(Map.Entry v: mapP.entrySet()) {
        // 	arr[j]=(int) v.getValue();
        // 	j++;
        // }
        // int k=0;
        // for(Map.Entry v2: mapS.entrySet()) {
        // 	if((int)v2.getValue() != arr[k]) {
        // 		return false;
        // 	}
        // 	k++;
        	
        // }
        
        // return true;


        //-----------------------------------------------------------
        Map<Character, String> map = new HashMap<>();

        String[] words = s.split("\s+");
        
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if (!map.containsValue(words[i])) {
                    map.put(pattern.charAt(i), words[i]);
                } else {
                    return false;
                }
            }
        }

        return true;


    }
}
