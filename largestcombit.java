public class largestcombit {
    public static void main(String[] argv){
        int[] candidates={16,17,71,62,12,24,14};
        System.out.println(countbit(candidates));
    }
    public static int countbit(int[] candidates){
        int n=candidates.length;
        int[] ans=new int[32];
        for(int i=0;i<n;i++){
            int x=31;
            while(candidates[i]>0){
                if((int)(candidates[i]&1)==(int)1){
                      ans[x]++;
                }
                candidates[i]=candidates[i]>>1;
                x--;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<32;i++){
            max=Math.max(ans[i],max);
        }
        return max;
    }
}
