class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        
        int maxProduct = Integer.MIN_VALUE;
        int leftProduct =1;
        int rightProduct = 1;
        for(int i=0;i<arr.length;i++){
            if(leftProduct ==0 ){
                leftProduct = 1;
            }
            if(rightProduct == 0){
                rightProduct = 1;
            }
            
            leftProduct = leftProduct * arr[i];
            rightProduct = rightProduct * arr[arr.length-i-1];
            maxProduct = Math.max(maxProduct,Math.max(leftProduct,rightProduct));
        }
        return maxProduct;
        
    }
    
   
}