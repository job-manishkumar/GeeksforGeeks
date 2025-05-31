// User function Template for Java
class Solution {
    public int maxConsecutiveCount(int[] arr) {
        // code here
        
        int maxCount = 1;
        int count = 1;
        for(int i=01;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else{
                count = 1;
            }
        }
        return maxCount;
    }
}
