public class smoothdecent {
    public static void main(String[] argv){
        int[] nums={3,2,1,4};
        System.out.println(descent(nums));
    }
    public static long descent(int[]prices){
        int count=0;
        int i=0;
        int j=1;
        long ans=1;
        while(j<prices.length){
            if(prices[j-1]-prices[j]==1){
                count=j-i+1;
                ans+=count;
            }else{
                i=j;
                ans+=1;
            }
            j++;
        }
        return ans;
    }
}
