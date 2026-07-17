class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int zc = 0;
        while(right<nums.length){
            if(nums[right]==0){
                zc++;
            }
            if(zc>k){
                if(nums[left]==0){
                    zc--;
                }
                left++;
            }
            if(zc<=k){
                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}