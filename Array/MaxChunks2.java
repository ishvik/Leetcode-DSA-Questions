public class MaxChunks2 {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int []pm = new int[n];
        int []sm = new int[n];
        pm[0] = arr[0];
        sm[n-1] = arr[n-1];
        
        for(int i=1;i<arr.length;i++){
            pm[i] = Math.max(pm[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            sm[i] = Math.min(sm[i+1],arr[i]);
        }
        int ans = 0;
        for(int i=0;i<n-1;i++){
            if(pm[i]<=sm[i+1]){
                ans++;
            }
        }
        return ans+1;
    }
}
