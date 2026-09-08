class Solution {
    public int countCommas(int n) {
        int ans = 0;
        int start = 1000;

        while (start <= n) {
            int end = start * 1000 - 1;

            if (end > n) {
                end = n;
            }

            ans += (end - start + 1) * (start / 1000);

            start *= 1000;
        }

        return ans;
    }
}