class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] exact = new long[max + 1];

        for (int i = max; i >= 1; i--) {
            long cnt = 0;
            for (int j = i; j <= max; j += i) {
                cnt += freq[j];
            }

            exact[i] = cnt * (cnt - 1) / 2;

            for (int j = i * 2; j <= max; j += i) {
                exact[i] -= exact[j];
            }
        }

        // Prefix sums
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exact[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long k = queries[i] + 1; // queries are 0-indexed

            int lo = 1, hi = max;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (prefix[mid] >= k)
                    hi = mid;
                else
                    lo = mid + 1;
            }
            ans[i] = lo;
        }

        return ans;
    }
}