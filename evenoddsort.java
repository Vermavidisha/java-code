import java.util.Arrays;
public class evenoddsort {
    public static void main(String[] argv){
        int[]nums={4,1,2,3};
        int []ans=oddevensort(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] oddevensort(int[] nums){
        int n=nums.length;
        int e=0;
        int o=0;
        int[] even=new int[(n+1)/2];
        int []odd=new int[n/2];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even[e++]=nums[i];
            }else{
                odd[o++]=nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        e=0;
        o=n/2-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[e++];
            }else{
                nums[i]=odd[o--];
            }
        }
        return nums;
    }
}
