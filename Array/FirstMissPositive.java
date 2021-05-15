public class FirstMissPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(i+1 == nums[i]){
                continue;
            }
            if(nums[i]<1 || nums[i]>n){
                continue;
            }
            
            int i1 = i;
            int i2 = nums[i]-1;
            if(nums[i2] == nums[i1]){
                continue;
            }
            
            int t = nums[i1];
            nums[i1] = nums[i2];
            nums[i2] = t;
            i--;
        }
        
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
        
    }
}
