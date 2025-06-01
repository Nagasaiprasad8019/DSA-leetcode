class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=nums[left]+nums[right];
            if(mid==target){
                return new int[]{left+1,right+1};
            }
            else if(mid>target){
                right--;
            }
            else{
                left++;
            }
        }
        return null;
    }
}