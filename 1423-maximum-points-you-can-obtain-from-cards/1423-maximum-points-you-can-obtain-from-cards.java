class Solution {
  public int maxScore(int[] cardScore, int k) {
    int currSum = 0;
    int n = cardScore.length;

    for (int i = 0; i < k; i++) {
      currSum += cardScore[i];
    }

    int ans = currSum;

    for (int i = 1; i <= k; i++) {
      currSum = currSum - cardScore[k - i] + cardScore[n - i];
      ans = Math.max(ans, currSum);
    }
    return ans;
  }
}