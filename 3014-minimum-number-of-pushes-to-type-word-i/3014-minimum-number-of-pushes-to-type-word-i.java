class Solution {
    public int minimumPushes(String word) {
        int cnt = 0;
        int n = word.length();
        int i = 0;
        while(n>0){
            if(i<8){
                cnt++;
            }
            else if(i<16){
                cnt+=2;
            }
            else if(i<24){
                cnt+=3;
            }
            else{
                cnt+=4;
            }
            i++;
            n--;
        }
        return cnt;
    }
}