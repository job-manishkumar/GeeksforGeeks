class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum<0){
                sum = 0;
            }
            sum = sum+arr[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
