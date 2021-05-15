public class MaxChunks {
    public int maxChunksToSorted(int[] arr) {
        int cmax = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
           cmax = Math.max(cmax,arr[i]);
            if(cmax == i){
                ans++;
            }
        }
        return ans;
    }
}
