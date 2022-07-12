class Solution {
     public int candy(int[] nums) {
        int n=nums.length;
        int ans=0;
        int[] candies=new int[n];
        for(int i=n-1;i>0;i--){
            if(nums[i-1]>nums[i])
                candies[i-1]=candies[i]+1;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1] && candies[i]>=candies[i+1])
                candies[i+1] = candies[i]+1;
            ans+=candies[i];
        }
        return n+ans+candies[n-1];
    }
}
