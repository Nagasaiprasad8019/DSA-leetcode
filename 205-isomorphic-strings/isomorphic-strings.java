class Solution {
    public boolean isIsomorphic(String s, String t) {
         int map[]=new int[200];
         int map1[]=new int[200];
         if(s.length()!=t.length())return false;
         for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)]!=map1[t.charAt(i)])return false;
            map[s.charAt(i)]=i+1;
            map1[t.charAt(i)]=i+1;
         }
        return true ;
    }
}