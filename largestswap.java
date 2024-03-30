import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class largestswap {
    public static void main(String[] argv){
        int num=1234;
        System.out.println(findgreater(num));
    }
    public static int findgreater(int num){
       List<Integer>e=new ArrayList<>();
       List<Integer>o=new ArrayList<>();
       List<Integer>nums=new ArrayList<>();
       while(num>0){
        nums.add(num%10);
        if((num%10)%2==0){
            e.add(num%10);
        }else{
            o.add(num%10);
        }
        num/=10;
       }
       Collections.reverse(nums);
       Collections.sort(e);
       Collections.reverse(e);
       Collections.sort(o);
       Collections.reverse(o);
       int even=0;
       int odd=0;
       int sum=0;
       for(int i=0;i<nums.size();i++){
        if(nums.get(i)%2==0){
            sum=(sum*10)+e.get(even);
            even++;
        }else{
            sum=(sum*10)+o.get(odd);
            odd++;
        }
       }
       return sum;
    }
}
