class Solution {
    public int smallestNumber(int n, int t) {
        int prod = 1;
        int temp = n;
        while(temp>0){
            prod*=temp%10;
            temp/=10;
        }
        while(prod%t!=0){
            n++;
            prod = 1;
            temp = n;
            while(temp>0){
                prod*=temp%10;
                temp/=10;
            }
        }
        return n;
    }
}