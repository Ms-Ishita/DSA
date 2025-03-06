class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<row; i++){
            result.add(new ArrayList<>());
            for(int j =0; j<col;j++){
                result.get(i).add(0);
            }
        }
        

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                int newvalue= ((i*col+j+k)%(row*col));
                int rowIndex = newvalue/col;
                int colIndex = newvalue%col;
                result.get(rowIndex).set(colIndex, grid[i][j]);
            }
            
        }
        return result;


        
    }
}