class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rowInd = 0;
        int colInd = col-1;

        while(rowInd<row && colInd>=0){
            int element = matrix[rowInd][colInd];

            if(element == target){
                return true;
            }
            else if(element<target){
                rowInd++;
            }
            else{
                colInd--;
            }
        }
        return false;
        
        
    }
}