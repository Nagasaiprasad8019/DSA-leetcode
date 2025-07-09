class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)return s;
        String op="";
        for(int i=1;i<s.length();i++){
            //for odd length palindrome like aba
            int l=i;
            int h=i;
            while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)){
                l--;
                h++;
            }
            String palindrome=s.substring(l+1,h);
            if(palindrome.length()>=op.length()){
                op=palindrome;
            }
            int m=i-1;
            int n=i;
            //for even length palindrome like abba
            while(m>=0 && n<s.length() && s.charAt(m)==s.charAt(n)){
                m--;
                n++;
            }
            String palindromes=s.substring(m+1,n);
            if(palindromes.length()>=op.length()){
                op=palindromes;
            }
        }
        return op;
    }
}