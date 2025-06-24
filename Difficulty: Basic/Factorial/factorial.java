class Solution {
    static int factorial(int n) {
        // code here
        //base condition
        if(n==0){
            return 1;
        }
        return factorial(n-1)*n;
    }
}