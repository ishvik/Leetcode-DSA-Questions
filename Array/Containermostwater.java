class Containermostwater {
    public int maxArea(int[] height) {
        int omax = Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int s = (j-i)*Math.min(height[i],height[j]);
            omax = Math.max(omax,s);
            if(height[i] <= height[j]){
                i++;
            }else if(height[i] > height[j]){
                j--;
            }
        }
        return omax;
    }
}