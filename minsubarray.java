public class minsubarray {
    public static void main(String[] argv){
        int[] nums={-1,-1,1};
        int k=2;
        System.out.println(findarray(nums,k));
    }
    public static int findarray(int[] nums,int k){
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
          for(int j=i;j<nums.length;j++){
                  sum=sum+nums[j];
             }
              if(sum==k){
                count++;
               }
    
        }
        return count;
    }
}
