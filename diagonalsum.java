public class diagonalsum {
    public static int diagonalsum(int matrix[][]){
        int sum = 0;
        for (int i=0;i<matrix.length;i++){        
        for (int j=0;j<matrix[0].length;j++){
            if(i==j){
                sum+=matrix[i][j];
            }  
            else if(i+j == matrix.length-1){
                sum += matrix[i][j];
            }      
        }
    }
    return sum;
}
public static void main (String args[]){
    int matrix[][]={{1,2,3,4},
    {1,4,5,6},
    {9,8,7,6},
    {5,4,6,7}};
    System.out.println(diagonalsum(matrix));
}
}