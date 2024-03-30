public class diagonalsum {
     public static void main(String[] args) {
        int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     System.out.print(printDiagonal(nums));
    }
    public static int printDiagonal(int[][] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i][i];
            if(i!=nums.length-i-1)
            sum+=nums[i][nums.length-i-1];
        }
        return sum;
    }
}
