
class Solution {
    static int checkCompressed(String S, String T) {
        int i = 0, j = 0;

    while (j < T.length()) {

        if (Character.isDigit(T.charAt(j))) {

            int count = 0;

            while (j < T.length() && Character.isDigit(T.charAt(j))) {

                count = count * 10 + (T.charAt(j) - '0');

                j++;

            }

            i += count;

        } else {

            if (i >= S.length() || T.charAt(j) != S.charAt(i)) {

                return 0;

            }

            i++;

            j++;

        }

    }

    return i == S.length()? 1:0;
        
        
    }
}
