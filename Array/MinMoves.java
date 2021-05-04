class MinMoves {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        int mid = nums[n/2];
        for(int i=0;i<nums.length;i++){
            res += Math.abs(nums[i]-mid);
        }
        return res;
    }
}
