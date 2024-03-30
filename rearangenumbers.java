import java.util.ArrayList;
import java.util.List;

public class rearangenumbers {
    public static void main(String[] argv){
        int [] nums={3,1,-2,-5,2,-4};
        int[] ans=rearange(nums);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] rearange(int[] nums){
      int[] ans=new int[nums.length];
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }
        int n=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=pos.get(p);
                p++;
            }else{
                ans[i]=neg.get(n);
                n++;
            }
        }
        return ans;
    }
}

