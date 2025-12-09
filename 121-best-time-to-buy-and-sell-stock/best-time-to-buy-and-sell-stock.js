/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let max=0;
    let min=prices[0];
    for(let i=1;i<prices.length;i++){
        let profit=prices[i]-min;
        max=Math.max(max,profit);
        min=Math.min(min,prices[i]);
    }
    return max;
};