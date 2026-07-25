class Solution {
    public int help(int[] nums,int k){
        int l = 0;
        int r = 0;
        int cnt = 0;
        int n = nums.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        while(r<n){
            int val = hmap.getOrDefault(nums[r],0);
            hmap.put(nums[r],val+1);
            while(hmap.size()>k){
                val = hmap.get(nums[l]);
                if(val==1){
                    hmap.remove(nums[l]);
                }
                else{
                    hmap.put(nums[l],val-1);
                }
                l++;
            }
            cnt=cnt+(r-l+1);
            r++;
        }
        return cnt;
    } 
    public int subarraysWithKDistinct(int[] nums, int k) {
        return help(nums,k)-help(nums,k-1);
    }
}