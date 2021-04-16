public class WiggleSort {
    /*
     * @param nums: A list of integers
     * @return: nothing
     */
    public void wiggleSort(int[] nums) {
        // write your code here
        for(int i=0;i<nums.length-1;i++){
            if(i%2 == 0){
                if(nums[i] <= nums[i+1]){
                   continue;
                }else{
                    int t = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = t;
                }
            }else{
                if(nums[i] >= nums[i+1]){
                   continue;
                }else{
                    int t = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = t;
                }
            }
        }
    }
}