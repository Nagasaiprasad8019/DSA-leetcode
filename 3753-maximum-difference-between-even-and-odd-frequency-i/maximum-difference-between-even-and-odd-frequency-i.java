class Solution {
    public int maxDifference(String s) {
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch:s.toCharArray()){
            if(map.get(ch)%2==1){
            maxOdd=Math.max(map.get(ch),maxOdd);
            }
            else{
                minEven=Math.min(map.get(ch),minEven);
            }
        }
        return maxOdd-minEven;
         
    }
}