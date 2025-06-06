// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int l=0;
        Map<Character,Integer> map = new HashMap<>();
        int maxLength = -1;
        for(int r =0;r<s.length();r++){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
            }
            else{
                map.put(s.charAt(r),1);
            }
            if(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            if(map.size()==k){
                maxLength = Math.max(maxLength,r-l+1);
            }
        }
        return maxLength;
    }
}