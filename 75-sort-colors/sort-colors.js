/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let low=0;
    let high=nums.length-1;
    let mid=0;
    while(mid<=high){
        if(nums[mid]===0){
            let t=nums[low];
            nums[low]=nums[mid];
            nums[mid]=t;
            low++;
            mid++;
        }
        else if(nums[mid]===2){
            let t=nums[high];
            nums[high]=nums[mid];
            nums[mid]=t;
            high--;
        }
        else{
            mid++;
        }
    } 
};