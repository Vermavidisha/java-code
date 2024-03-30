public class pascaltriangle {
    public static void main(String[] args) {
        int row=5;
        int[][] ans=pascal(row);
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] pascal(int row){
        int[][] ans=new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                }
            }
        }
        return ans;
    }
    
}
