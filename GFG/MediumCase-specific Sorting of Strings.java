
class Solution

{
    public static String caseSort(String str)

    {

        int n= str.length();

        int lc = 0;

        int uc = 0;

        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uc++;
            }else{
                lc++;
            }
        }

        char[] lower = new char[lc];

        char[] upper = new char[uc];

        int i = 0, j = 0;

        for(int k = 0; k < n; k++){
            char ch = str.charAt(k);
            if(Character.isUpperCase(ch)){
                upper[i] = ch;
                i++;
            }else{
                lower[j] = ch;
                j++;
            }
        }
        
        Arrays.sort(upper);
        Arrays.sort(lower);
        
        StringBuilder ans = new StringBuilder();
        
        i = 0;
        j = 0;

        for(int k = 0; k < n; k++){
            char ch = str.charAt(k);
            if(Character.isUpperCase(ch)){
                ans.append(upper[i]);
                i++;
            }else{
                ans.append(lower[j]);
                j++;
            }
        }
        return ans.toString();
    }
}


//------------------------------------------------------------------
/*
below two approaches are passing 160/163 test cases.

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        String lowStr = "";
        String uppStr = "";
        
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                uppStr+=str.charAt(i);
            }
            else{
                lowStr+=str.charAt(i);
            }
        }
        
        char[] lowChar = lowStr.toCharArray();
        char[] uppChar = uppStr.toCharArray();
        
        Arrays.sort(lowChar);
        Arrays.sort(uppChar);
        
        
        Queue<Character> low = new LinkedList<>();
        Queue<Character> upp = new LinkedList<>();
        
        for(int i=0; i<lowChar.length; i++){
            low.add(lowChar[i]);
        }

        for(int i=0; i<uppChar.length; i++){
            upp.add(uppChar[i]);
        }      
        
        
        String ans="";
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                ans+=upp.poll();
                
            }
            else{
                ans+=low.poll();
            }
        
        }
        
        return ans;
    }
}

//-------------------------------------------------------
class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                list1.add(str.charAt(i));
            }
            else{
                list2.add(str.charAt(i));
            }
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        String ans="";
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                ans+=list1.remove(list1.size()-list1.size());
                
            }
            else{
                ans+=list2.remove(list2.size()-list2.size());
            }
        
        }
        
        return ans;
    }
}


*/
