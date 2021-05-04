public class BMP {
    /**
     * @param grid: a 2D grid
     * @return: the minimize travel distance
     */
    public int minTotalDistance(int[][] grid) {
        // Write your code here
        int res = 0;
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int j=0;j<grid[0].length;j++){
            for(int i=0;i<grid.length;i++){
                if(grid[i][j] == 1){
                    y.add(j);
                }
            }
        }

        ArrayList<Integer> x = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    x.add(i);
                    temp.add(i);
                    temp.add(j);
                }
            }
        }

        int yc = y.get((0+y.size())/2);
        int xc = x.get((0+x.size())/2);
        for(int i=0;i<temp.size();i++){
            res = res+Math.abs(xc-temp.get(i))+Math.abs(yc-temp.get(i+1));
            i++;
        }
        return res;
    }
}
