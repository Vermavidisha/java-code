public class countsort {
     public static void main(String[] args) {
        int[] nums={1,2,3,4,1,2,7};
        countSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static void countSort(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest,nums[i]);
        }
        int[] count=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
        
    }
    
}
