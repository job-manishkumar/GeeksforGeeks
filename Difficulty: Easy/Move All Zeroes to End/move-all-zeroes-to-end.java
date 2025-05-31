// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int nz = 0;
        int z = 0;
        while(nz<arr.length){
            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] =temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }
}