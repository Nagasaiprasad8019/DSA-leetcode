class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            st.push(i);
        }
        for(int i=n-1;i>=0;i--){
            arr[i]=-1;
            while(!st.isEmpty()&& nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                arr[i]=nums[st.peek()];
            }
            st.push(i);
        }
        return arr;
    }
}