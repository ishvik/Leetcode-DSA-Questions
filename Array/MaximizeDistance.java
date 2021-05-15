public class MaximizeDistance{
    public int maxDistToClosest(int[] seats) {
        int t = 0;
        if(seats[0] == 0){
            t = -1;
        }
        
        int ans = 0;
        int pc = 0;
        for(int i=0;i<seats.length;i++){
            if(seats[i] == 1){
                if(t == -1){
                    ans = i-pc;
                }else if(t == 1){
                  ans = Math.max(ans,(i-pc)/2);
                }
            
            pc = i;
            t = 1;
            }
        }
        if(seats[seats.length-1] == 0){
            ans = Math.max(ans,(seats.length-1)-pc);
        }
        return ans;
    }
}