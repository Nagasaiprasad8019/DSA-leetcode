class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int ele=0;
        for(int num:nums){
            if(cnt==0){
                ele=num;
                cnt++;
            }
            else if(num==ele)cnt++;
            else cnt--;
        }
        for(int num:nums){
            if(num==ele)return num;
        }
        return 0;
    }
}