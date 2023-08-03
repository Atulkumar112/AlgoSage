class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if(digits.length()==0){
            return list;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtracking(digits, 0, map, list, new StringBuilder());

        return list;

    }

    public void backtracking(String digits, int i, Map<Character, String> map, List<String> list, StringBuilder sb){
        if(i==digits.length()){
            list.add(sb.toString());
            return;
        }

        String curr = map.get(digits.charAt(i));

        for(int k=0; k<curr.length(); k++){
            sb.append(curr.charAt(k));
            backtracking(digits, i+1, map, list, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

