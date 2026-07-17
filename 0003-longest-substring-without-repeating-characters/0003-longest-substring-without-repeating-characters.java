class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int left = 0;
        int len = 0;
        for(int right = 0;right<s.length();right++){
            if(hmap.containsKey(s.charAt(right))){
                left = Math.max(left,hmap.get(s.charAt(right))+1);
            }
            else{
                hmap.put(s.charAt(right),right);
            }
            if((right-left+1)>len){
                len=right-left+1;
            }
            hmap.put(s.charAt(right),right);
        }
        return len;
    }
}