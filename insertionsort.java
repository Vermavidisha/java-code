public class insertionsort {
    public static void main(String[] args) {
        int[] nums={4,3,5,1,2};
        insertionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static void insertionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int currpos=nums[i];
            int pre=i-1;
            while(pre>=0&&nums[pre]>currpos){
                nums[pre+1]=nums[pre];
                pre--;
            }
        nums[pre+1]=currpos;
        }
    }
}
