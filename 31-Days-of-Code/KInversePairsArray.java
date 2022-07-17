class Solution {
    public int kInversePairs(int n, int k) {
        int mod=1000_000_007;
        int[] dp=new int[k+1];
        dp[0]=1;
        for (int N=2;N<=n;N++) {
            int[] temp=dp.clone();
            for (int K=1;K<=k;K++) {
                dp[K]=(temp[K]+dp[K-1])%mod;
                if (K-N>=0) {
                    dp[K]=(dp[K]-temp[K-N]+mod)% mod;
                }
            }
        }
        return dp[k];  
    }
}
