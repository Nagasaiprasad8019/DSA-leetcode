class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Integer> map1=new HashMap<>();
        HashMap <Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            int index1=map1.getOrDefault(a,-1);
            int index2=map2.getOrDefault(b,-1);
            if(index1!=index2){
                return false;
            }
            map1.put(a,i);
            map2.put(b,i);
        }
        return true ;
    }
}