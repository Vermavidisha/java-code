public class numberfilledzero {
    public static void min(String[] argv){
        int[] nums={1,3,0,0,2,0,0,4};
        System.out.println(findZerofilled(nums));
    }
    public static long findZerofilled(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i;
                while (j < nums.length && nums[j] == 0) {
                    j++;
                    count++;
                }
                i = j - 1;
            }
        }
    
        return count;
    }
}
