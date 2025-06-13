class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            ans=Math.abs(nums[i]-nums[i+1]);
            max=Math.max(ans,max);
        }
        ans=Math.abs(nums[0]-nums[nums.length-1]);
        max=Math.max(ans,max);
        return max;
    }
}