class Solution {
    public int tribonacci(int n) {
        int first=0;
        int sec=1;
        int third=1;
        for(int i=0;i<n;i++){
            int res=first+sec+third;
            first=sec;
            sec=third;
            third=res;
        }
        return first;
    }
}