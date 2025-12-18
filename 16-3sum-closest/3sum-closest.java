class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest_sum=Integer.MAX_VALUE/2;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int curr_sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(curr_sum-target)<Math.abs(closest_sum-target)){
                        closest_sum=curr_sum;
                    }
                }
            }
        }
        return closest_sum;

    }
}