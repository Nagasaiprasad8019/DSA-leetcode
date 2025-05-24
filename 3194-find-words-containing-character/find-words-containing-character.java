class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
     ArrayList<Integer> list=new ArrayList<>();
     for(int i=0;i<words.length;i++){
        char word[]=words[i].toCharArray();
          for(int j=0;j<word.length;j++){
            if(word[j]==x){
                list.add(i);
                break;
            }
          }
      }
      return list;
    }
}