public class SprialMatrixArray {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endColumn = matrix[0].length-1;
        while(startCol<=endRow == startCol<=endColumn){
            //Top
            for(int j=startCol; j<=endRow; j++){
                System.out.print(matrix[startCol][j]+" ");
            }

            //Right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endColumn]+" ");
            }

            //Bottom
            for(int j=endColumn-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //Left
            for(int i = endRow-1; i>=startRow+1; i--){
                if(startCol==endColumn){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(matrix);
    }
}
