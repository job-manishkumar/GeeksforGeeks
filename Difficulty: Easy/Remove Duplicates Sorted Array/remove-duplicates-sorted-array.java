class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        if(arr.length==1){
            return arr.length;
        }
        
        int i = 0;
        int j = 1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i+1;
    }
}