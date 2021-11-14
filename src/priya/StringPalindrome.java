package priya;

public class StringPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {

            if(s == null || s.length()==0){
                return true;
            }

            s = s.toLowerCase();
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            for(int i = 0; i < s.length()/2; i++){

                char start = s.charAt(i);
                char end = s.charAt(s.length() - 1 - i);

                if (start != end){
                    return false;
                }
            }
            return true;
        }
    }
}
