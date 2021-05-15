public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int []prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }
        
        int suffix = 1;
        int i = prefix.length-1;
        while(i>=1){
            prefix[i] = prefix[i-1]*suffix;
            suffix *= nums[i];
            i--;
        }
        prefix[0] = suffix;
        return prefix;
    }
}
