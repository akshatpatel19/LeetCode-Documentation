class Solution {
    public int longestSubsequence(int[] nums) {
        int[] z = new int[nums.length];
        if(Arrays.equals(nums,z)) return 0;
        int x = 0;
        for(int i = 0;i<nums.length;i++){
            x^=nums[i];
        }
        if(x!=0){
            return nums.length;
        }
        return nums.length-1;
    }
}