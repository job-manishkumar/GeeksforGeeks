class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        int majElement1 = Integer.MIN_VALUE;
        int count1 = 0;
        int majElement2 = Integer.MIN_VALUE;
        int count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == majElement1){
                count1++;
            }
            else if(nums[i] == majElement2){
                count2++;
            }
            else if(count1==0){
                count1 = 1;
                majElement1 = nums[i];
            }
            else if(count2==0){
                count2 =1;
                majElement2 = nums[i];
            }
            else{
                count1--;
                count2--;
            }
            
        }
        int freq1 = 0;
        int freq2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==majElement1){
                freq1++;
            }
            if(nums[i]==majElement2){
                freq2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(freq1>nums.length/3 && freq2>nums.length/3){
            if(majElement1>majElement2){
               list.add(majElement2);
               list.add(majElement1);
               return list;
            }
            list.add(majElement1);
            list.add(majElement2);
            return list;
            
        }
        if(freq1>nums.length/3 && !(freq2>nums.length/3)){
             list.add(majElement1);
              return list;
        }
        if(!(freq1>nums.length/3) && freq2>nums.length/3){
             list.add(majElement2);
              return list;
        }
        else{
            return list;
        }
        
    }
    
}
