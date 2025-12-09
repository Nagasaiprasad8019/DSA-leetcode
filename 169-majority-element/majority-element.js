/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let ele=0;
    let cnt=0;
    for(const num of nums){
        if(cnt===0){
            ele=num;
            cnt++;
        }
        else if(ele===num)cnt++;
        else cnt--;
    }
    for(const num of nums){
        if(num===ele)return num;
    }
    return -1;
};