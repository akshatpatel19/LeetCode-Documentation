class Solution {
    public int gcd(int n,int m){
        int cnt = 0;
        for(int i = 1;i<=Math.min(m,n);i++){
            if(m%i==0 && n%i==0){
                cnt = i;
            }
        }
        return cnt;
    }
    public int gcdOfOddEvenSums(int n) {
        int so = 0;
        int se = 0;
        for(int i =1;i<(2*n);i+=2){
            so+=i;
            se+=i+1;
        }
        return gcd(so,se);
    }
}