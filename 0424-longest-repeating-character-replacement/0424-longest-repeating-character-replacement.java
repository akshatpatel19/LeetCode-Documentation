class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int maxfreq = 0;
        int hmap[] = new int[26];
        while(right<s.length()){
            hmap[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq,hmap[s.charAt(right)-'A']);
            int chan = right-left+1-maxfreq;
            if(chan>k){
                hmap[s.charAt(left)-'A']--;
                maxfreq=0;
                left++;
            }
            if(chan<=k){
                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}