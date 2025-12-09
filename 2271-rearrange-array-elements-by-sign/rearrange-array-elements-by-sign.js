/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let pos=0;
    let neg=1;
    let arr=[];
    for(let j=0;j<nums.length;j++){
        if(nums[j]>0){
            arr[pos]=nums[j];
            pos+=2;
        }
        else{
            arr[neg]=nums[j];
            neg+=2;
        }
    }
    return arr;
};