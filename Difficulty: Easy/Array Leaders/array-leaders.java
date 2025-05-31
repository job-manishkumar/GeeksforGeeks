class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int leader = arr[arr.length-1];
        list.add(leader);
        for(int i=arr.length-2;i>=0;i--){
            if(leader<=arr[i]){
                leader = arr[i];
                list.add(leader);
            }
        }
        return reverse(list);
    }
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
      int i=0;
      int j = list.size()-1;
      while(i<j){
          int temp = list.get(i);
          list.set(i,list.get(j));
          list.set(j,temp);
          i++;j--;
      }
      return list;
    }
}
