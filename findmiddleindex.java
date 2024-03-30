public class findmiddleindex {
    public static void main(String[] argv){
        int[] nums={1,-1,4};
        System.out.println(findmiddle(nums));
    }
    public static int findmiddle(int[] nums){
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        if(nums.length==0){
            return -1;
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
