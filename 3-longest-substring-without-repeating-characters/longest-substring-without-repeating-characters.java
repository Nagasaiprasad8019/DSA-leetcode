class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int max=Integer.MIN_VALUE;
        HashSet<Character> set=new HashSet<>();
        int start=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}