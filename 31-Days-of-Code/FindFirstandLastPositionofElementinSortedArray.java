class Solution {
    public int[] searchRange(int[] nums, int target) {
        //binary search
        int start=0;
        int end=nums.length-1;
        if(nums.length==0)
            return new int[]{-1,-1};
        while(start<=end){
            int mid =(start+end)/2;
            if(target==nums[mid]){
                if(nums[start]==target && nums[end]==target)
                    return new int[]{start, end};
                while(nums[start]<target)
                    start++;
                while(nums[end]>target)
                    end--;
            }
            else if(target>nums[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return new int[]{-1,-1};
    }
}
