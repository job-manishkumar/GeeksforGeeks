// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        
        ArrayList<Integer> positiveList = new ArrayList<>();
        ArrayList<Integer> negativeList = new ArrayList<>();
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                positiveList.add(arr.get(i));
            }
            else{
                negativeList.add(arr.get(i));
            }
        }
        int postiveIndex = 0;
        int negativeIndex = 0;
        int i = 0;
        while(postiveIndex<positiveList.size() && negativeIndex<negativeList.size()){
            if(i%2==0){
                arr.set(i,positiveList.get(postiveIndex));
                i++;
                postiveIndex++;
            }
            else{
                arr.set(i,negativeList.get(negativeIndex));
                i++;
                negativeIndex++;
            }
        }
        while(postiveIndex<positiveList.size()){
             arr.set(i,positiveList.get(postiveIndex));
            i++;
            postiveIndex++;
        }
        while(negativeIndex<negativeList.size()){
             arr.set(i,negativeList.get(negativeIndex));
            i++;
            negativeIndex++;
        }
    }
    
    
}