public class bubblesort {
     public static void main(String[] args) {
        int[] nums={4,3,5,1,2};
        bubbleSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
   
}
