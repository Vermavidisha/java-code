
public class sortArray {
    public static void main(String[] argv){
        int[] nums={4,2,5,7};
        int [] ans=sort(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
        
    }
    public static int[] sort(int[] nums){
        int [] arr=new int[nums.length];
        int e=0;
        int o=1;

        for(int i:nums){
            if(i%2==0){
             arr[e]=i;
             e+=2;
            }else{
                arr[o]=i;
                o+=2;
            }
        }
        return arr;
    }
}
