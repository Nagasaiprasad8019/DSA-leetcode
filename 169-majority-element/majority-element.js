/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let n=nums.length;
    for(let i=0;i<n;i++){
        let count=1;
        for(let j=i+1;j<n;j++){
            if(nums[i]===nums[j]){
                count++;
            }
        }
        if(count>n/2)return nums[i];
    }
    return -1;
};