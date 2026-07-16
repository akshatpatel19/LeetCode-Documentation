class Solution {
    public int gcd(int n,int m){
        if(m==0){
            return n;
        }
        return gcd(m,n%m);
    }
    public long gcdSum(int[] nums) {
        int[] prefixGCD = new int[nums.length];
        int[] mx = new int[nums.length];
        int x = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>x){
                mx[i] = nums[i];
                x = mx[i];
            }
            else{
                mx[i] = x;
            }
        }
        for(int i = 0;i<nums.length;i++){
            prefixGCD[i] = (int)gcd(mx[i],nums[i]);
        }
        for(int i = 0;i<prefixGCD.length;i++){
            System.out.print(prefixGCD[i]+" ");
        }
        Arrays.sort(prefixGCD);
        int i = 0;
        int j = nums.length-1;
        long cnt = 0;
        while(i<j){
            cnt+=gcd(prefixGCD[i],prefixGCD[j]);
            i++;
            j--;
        }
        return cnt;
    }
}