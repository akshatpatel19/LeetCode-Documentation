class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0;i<word.length();i++){
            int val = hmap.getOrDefault(word.charAt(i),0);
            hmap.put(word.charAt(i),val+1);
        }
        int arr[] = new int[hmap.size()];
        int i = 0;
        for(int num : hmap.values()){
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);
        i = 0;
        int cnt = 0;
        int sum = 0;
        for(int j = arr.length-1;j>=0;j--){
            if(i%8==0){
                cnt++;
            }
            sum+=arr[j]*cnt;
            i++;
        }
        return sum;
    }
}