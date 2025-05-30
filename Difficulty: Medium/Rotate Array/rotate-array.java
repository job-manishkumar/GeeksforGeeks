// User function Template for Java
//import java.util.*;
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        d = arr.length - (d % arr.length);
        reverse(arr,0,arr.length-1);
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
    }
    
    public static  void reverse(int[] arr, int si, int ei){
       while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;ei--;
       }
    }
    
}