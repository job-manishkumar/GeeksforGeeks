// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> list = new Vector<>();
        //insert array to vector
        for(int i:arr){
            list.add(i);
        }
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)!=9){
                list.set(i,list.get(i)+1);
                return list;
                
            }
            else{
                list.set(i,0);
            }
        }
        list = new Vector<>(arr.length);
        list.add(1);
        for(int i=0;i<arr.length;i++){
            list.add(0);
        }
        return list;
    }
}