class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int max = -1;
        int second = -1;
        int third = -1;
        for(int i:arr){
            if(max<i){
                third = second;
                second = max;
                max = i;
            }
            else if(second<i){
                third = second;
                second = i;
            }
            else if(third<i){
                third = i;
            }
        }
        return third;
    }
}