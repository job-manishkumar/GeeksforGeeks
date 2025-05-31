// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // code here
        int majElement = arr[0];
        int freq = 1;
        for(int i=1;i<arr.length;i++){
            if(freq ==0){
                majElement = arr[i];
            }
            if(majElement != arr[i]){
                freq--;
            }
            else{
                freq++;
            }
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(majElement == arr[i]){
                count++;
            }
        }
        if(count>arr.length/2){
            return majElement;
        }
        return -1;
        
    }
}