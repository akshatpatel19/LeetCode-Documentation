class Solution {
    public int maxProduct(int n) {
        List<Integer> lst = new ArrayList<>();
        while(n>0){
            lst.add(n%10);
            n/=10;
        }
        Collections.sort(lst);
        return lst.get(lst.size()-1)*lst.get(lst.size()-2);
    }
}