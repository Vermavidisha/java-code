public class searchin2Darray {
     public static void main(String[] args) {
        int[][] matrix={{4,6,7,8},{5,10,12,14},{11,13,15,18},{22,34,56,77}};
        int key=15;
        searchInsortedMatrix(matrix,key);
        
    }
    public static boolean searchInsortedMatrix(int[][] matrix,int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col +")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }
    
}
