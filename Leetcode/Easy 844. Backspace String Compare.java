class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder sbOfs = new StringBuilder();
        StringBuilder sbOft = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#' && sbOfs.length()==0){
                continue;
            }
            else if(s.charAt(i)=='#'){
                sbOfs.setLength(sbOfs.length() - 1);
            }     
            else{
                sbOfs.append(s.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#' && sbOft.length()==0){
                continue;
            }
            else if(t.charAt(i)=='#'){
                sbOft.setLength(sbOft.length() - 1);
            }     
            else{
                sbOft.append(t.charAt(i));
            }
        }

        return sbOfs.compareTo(sbOft)==0 ? true : false;
    }
}
