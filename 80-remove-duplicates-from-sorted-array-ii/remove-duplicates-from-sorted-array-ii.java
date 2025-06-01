class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=2;
        int k=0;
        int n=nums.length-1;
        while(i<n && j<=n){
            if(nums[i]!=nums[j]){
                nums[k++]=nums[i];
            }
            i++;
            j++;
        }
         while(i<nums.length){
            nums[k++]=nums[i];
            i++;
         }
        return k;
        }
}