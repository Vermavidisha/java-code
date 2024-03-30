public class zeroes {
    public static void main(String[] args) {
        int[][] matrix={{1,3,4},{5,0,6},{2,7,8}};
        setzeroes(matrix);
        /*int n=matrix.length;
        int m=matrix[0].length-1;
        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }*/
    }
    public static void setzeroes(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int col0=1;
        /*int[][]nums2=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                nums2[i][j]=nums[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                if(nums[i][j] == 0){
                    for(int k=0;k<m;k++)
                    nums2[i][k]=0;

                    for(int k=0;k<n;k++)
                    nums2[k][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                nums[i][j]=nums2[i][j];
            }
        }*/
        /*for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                if(nums[i][j] == 0){
                makerow(i,nums,n);
                makecol(j,nums,m);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==-1){
                    nums[i][j]=0;
                }
            }
        }
    }
     public static void makerow(int i,int[][] nums,int m){
        for(int j=0;j<m;j++){
            if(nums[i][j]!=0){
                nums[i][j]=-1;
            }
        }
    }
       public static void  makecol(int j,int[][] nums,int n){
        for(int i=0;i<n;i++){
            if(nums[i][j]!=0){
                nums[i][j]=-1;
            }
        }*/
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                col0=0;
            }
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
     for(int i=n-1;i>=0;i--){
        for(int j=m-1;j>=1;j--){
            if(matrix[i][0]==0||matrix[0][j]==0){
                matrix[i][j]=0;
            }
        }
        if(col0==0)
        matrix[i][0]=0;
     }
    }

}
