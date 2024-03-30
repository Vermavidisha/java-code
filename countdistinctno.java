
import java.util.HashSet;
import java.util.Set;
public class countdistinctno {
    public static void main(String[] argv){
        int[] nums={1,13,10,12,31};
        System.out.println(countAfterreverse(nums));
    }
    public static int countAfterreverse(int[] nums){
        Set<Integer>ans=new HashSet<>();
        for(int n:nums){
            ans.add(n);
            ans.add(reverse(n));
        }
        return ans.size();
    }
   public static int reverse(int n){
    int rev=0;
    while(n!=0){
      int rem=n%10;
      rev=rev*10+rem;
      n/=10;
    }
    return rev;
   }
}
