public class minoperation {
    public static void main(String[] argv){
        int[] nums={1,1,4,2,3};
        int x=5;
        System.out.print(count(nums,x));
    }
    public static int count(int[] nums,int x){
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        int currsum=0;
        int maxlen=-1;
        int l=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            while(l<=i&&currsum>sum-x){
                currsum-=nums[l];
                l++;
            }
            if(currsum==sum-x){
                maxlen=Math.max(maxlen,i-l+1);
            }
        }
        return maxlen==-1?-1:nums.length-maxlen;
    }
}
