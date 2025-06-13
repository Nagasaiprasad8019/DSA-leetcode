class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            ans=Math.abs(nums[i-1]-nums[i]);
            max=Math.max(ans,max);
        }
        ans=Math.abs(nums[0]-nums[nums.length-1]);
        max=Math.max(ans,max);
        return max;
    }
}