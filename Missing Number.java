class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s1 = (n*(n+1))/2;
        int s2=0;                                        // TC  O(N)
        for(int i=0;i<n;i++)                             // SC  O(1)   
        {
            s2 += nums[i];
        }
        int ans = s1-s2;
        return ans;
    }
}
