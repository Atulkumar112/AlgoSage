class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("[\\s]");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<words.length; i++){
		  StringBuilder temp = new StringBuilder();    
		  temp.append(words[i]);
		  temp.reverse();
		  sb.append(temp+" ");
		  
		}
        
        sb.setLength(sb.length() - 1);

        return sb.toString();
    }

}


// OR

class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0) return s;
        char[] arr = s.toCharArray();
        
        int start = 0;
       for(int i=0; i<arr.length; i++){
            if(arr[i] ==' '){
                swap(arr, start, i-1);
                start = i+1;     
            } 
            else if(i == arr.length-1){
              swap(arr, start, i);
            }
       }
        return new String(arr);
    }
    
    public void swap(char[] arr, int start, int end){
      
            while(end>start){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
}
