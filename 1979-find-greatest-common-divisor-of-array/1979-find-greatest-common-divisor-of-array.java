class Solution {
    public int gcd(int n,int m){
        if(m==0) return n;
        return gcd(m,n%m);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
}