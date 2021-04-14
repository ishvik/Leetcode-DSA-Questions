class MajortyEleI {
    public int majorityElement(int[] nums) {
        int var = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(var == nums[i]){
                count++;
            }else if(count == 0){
                var = nums[i];
                count = 1;
            }else{
                count--;
            }
        }
        return var;
    }
}