class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char ch1=stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                char ch2=jewels.charAt(j);
                if(ch1==ch2)count++;
            }
        }
        return count;
    }
}