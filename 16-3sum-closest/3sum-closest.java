class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum=Integer.MAX_VALUE/2;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int curr_sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(curr_sum-target)<Math.abs(closest_sum-target)){
                    closest_sum=curr_sum;
                }
                else if(curr_sum<target){
                    left++;
                }
                else if(curr_sum>target){
                    right--;
                }
                else{
                    return closest_sum;
                }
            }
        }
        return closest_sum;

    }
}