class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }
    public String backSpace(String s){
        StringBuilder st=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                st.append(ch);
            }
            else if(st.length()!=0){
                st.deleteCharAt(st.length()-1);
            }
        }
        return st.toString();
    }
}