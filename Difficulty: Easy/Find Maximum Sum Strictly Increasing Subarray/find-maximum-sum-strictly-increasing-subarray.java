// User function Template for Java

public class Solution {

    // Return maximum sum of strictly increasing
    // subarrays
    static int maxsum_SIS(int arr[], int n) {
        // Your code goes here
        int max = Integer.MIN_VALUE;
        int sum =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                sum = sum+arr[i];
            }
            else{
                max = Math.max(max,sum);
                sum = arr[i];
            }
        }
        max = Math.max(max,sum);
        return max;
    }
}