class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right<fruits.length){
            int val = hmap.getOrDefault(fruits[right],0);
            hmap.put(fruits[right],val+1);
            if(hmap.size()>2){
                val = hmap.get(fruits[left]);
                if(val==1){
                    hmap.remove(fruits[left]);
                }
                else{
                    hmap.put(fruits[left],val-1);
                }
                left++;
            }
            if(hmap.size()<=2){
                max = Math.max(max,right-left+1);
            }
            right++;
        }
        return max;
    }
}