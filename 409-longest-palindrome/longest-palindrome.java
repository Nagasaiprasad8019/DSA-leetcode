class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean freq=false;
        int even=0;
        for(int a:map.values()){
            if(a%2==0){
              even+=a;
            }
            else{
                even+=a-1;
                freq=true;
            }
        }
        if(freq)return even+1;
        return even;
    }
}