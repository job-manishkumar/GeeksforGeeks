class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int secondMax = -1;
        for(int i:arr){
            if(max<i){
                secondMax = max;
                max = i;
            }
            if(secondMax<i && i!=max){
                secondMax = i;
            }
        }
        return secondMax;
        
    }
}