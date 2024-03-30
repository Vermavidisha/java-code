public class findpivot {
    public static void main(String[] argv){
        int[] nums={1,7,3,6,5,6};
        System.out.println(findpivot(nums));
    }
    public static int findpivot(int[] nums){
        int leftsum=0;
        int rightsum=0;
        if(nums.length==0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            if(rightsum==leftsum){
                return i;
            }else{
                leftsum+=nums[i];
            }
        }
       return -1;
    }
}
