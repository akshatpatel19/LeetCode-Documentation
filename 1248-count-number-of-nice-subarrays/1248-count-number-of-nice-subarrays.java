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
            s+=nums[r];
            while(s>k){
                s-=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i= 0;i<nums.length;i++){
            if(nums[i]%2==1){
                nums[i]=1;
            }
            else{
                nums[i]=0;
            }
        }
        return help(nums,k)-help(nums,k-1);
    }
}