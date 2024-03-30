public class spiralmatrix {
  public static void main(String[] args) {
        int[][] nums={{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        printspiral(nums);

    }
    public static void printspiral(int[][] nums){
        int startrow=0;
        int startcol=0;
        int endrow=nums.length-1;
        int endcol=nums[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(nums[startrow][i]+" ");
            }
            //right
            for(int j=startrow+1;j<=endrow;j++){
                System.out.print(nums[j][endcol]+" "); 
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                 System.out.print(nums[endrow][i]+" ");
            }
            //left
            for(int j=endrow-1;j>startrow;j--){
                if(startcol==endcol){
                    break;
                }
                 System.out.print(nums[j][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
}
