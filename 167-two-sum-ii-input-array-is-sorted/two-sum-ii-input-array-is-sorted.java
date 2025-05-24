class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int mid=numbers[i]+numbers[j];
            if(mid==target){
                return new int[]{i+1,j+1};
            }
            else if(mid>target){
                j--;
            }
            else{
                i++;
            }
        }
        return null;
    }
}