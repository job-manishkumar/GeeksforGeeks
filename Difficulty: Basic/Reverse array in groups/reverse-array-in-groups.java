// User function Template for Java

class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        
        for(int i=0;i<arr.size();i=i+k){
            reverse(arr,i,Math.min(i+k-1,arr.size()-1));
        }
        
    }
    
    public void reverse(ArrayList<Long> list,int si,int ei){
        while(si<ei){
            long temp = list.get(si);
            list.set(si,list.get(ei));
            list.set(ei,temp);
            si++;
            ei--;
        }
    }
}