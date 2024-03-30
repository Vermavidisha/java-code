public class subarraylessthank {
   public static void main(String[] argv){
    int[] nums={10,5,2,6};
    int k=100;
    System.out.println(findcount(nums,k));
   } 
   public static int findcount(int[] nums,int k){
    int count=0;
    long prod=1;
    if(k==0){
        return -1;
    }
    for(int i=0;i<nums.length;i++){
        prod=1;
        for(int j=i;j<nums.length;j++){
               prod*=nums[j]; 
              if(prod<k){
                count++;
            }
        }
    }
    return count;
   }
}
