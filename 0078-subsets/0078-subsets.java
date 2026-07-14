class Solution {
    public void helper(int[] nums, int idx, List<List<Integer>> lst, List<Integer> subset){
        if(idx == nums.length){
            lst.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[idx]);
        helper(nums,idx+1,lst,subset);
        subset.remove(subset.size()-1);
        helper(nums,idx+1,lst,subset);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(nums,0,lst,subset);
        return lst;
    }
}