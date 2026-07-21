class Solution {
    public int help(int[] nums, int k){
        int l = 0;
        int r = 0;
        int s = 0;
        int c = 0;
        while(r<nums.length){
            if(k<0){
                return 0;
            }
            s+=(nums[r]%2);
            while(s>k){
                s-=(nums[l]%2);
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return help(nums,k)-help(nums,k-1);
    }
}