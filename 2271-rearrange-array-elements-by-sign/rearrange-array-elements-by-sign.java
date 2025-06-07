class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        int m=0;
        int n=0;
        int i=0;
         while(m<list1.size() && n<list2.size()){
            arr[i++]=list1.get(m++);
            arr[i++]=list2.get(n++);
         }
        return arr;
    }

}