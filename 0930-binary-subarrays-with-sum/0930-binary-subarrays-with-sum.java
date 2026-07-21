class Solution {
    public int help(int[] nums,int goal){
        int l = 0;
        int r = 0;
        int s = 0;
        int c = 0;
        while(r<nums.length){
            if(goal<0){
                return 0;
            }
            s+=nums[r];
            while(s>goal){
                s-=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return help(nums,goal)-help(nums, goal-1);
    }
}