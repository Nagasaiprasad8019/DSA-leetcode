class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(char ch:s.toCharArray()){
         map.put(ch,map.getOrDefault(ch,0)+1);
       }
    PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
    pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();               // Get char with highest freq
            int count = map.get(c);       // Get its frequency
            for (int i = 0; i < count; i++) {
                sb.append(c);                 // Append 'c' → count times
            }
        }
        return sb.toString();


    }
}