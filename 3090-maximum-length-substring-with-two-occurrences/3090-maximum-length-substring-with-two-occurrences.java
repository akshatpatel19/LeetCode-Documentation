class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0;
        int r = 0;
        HashMap<Character,Integer> hmap = new HashMap<>();
        int max = 0;
        while(r<s.length()){
            int val = hmap.getOrDefault(s.charAt(r),0);
            hmap.put(s.charAt(r),val+1);
            val+=1;
            while(val>2){
                int lval = hmap.getOrDefault(s.charAt(l),0);
                hmap.put(s.charAt(l),lval-1);
                l++;
                val = hmap.getOrDefault(s.charAt(r),0);
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}