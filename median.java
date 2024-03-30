public class median {
    public static void main(String[] argv){
         int[] n1={1,2};
         int[] n2={3,4};
         double ans=printMedian(n1,n2);
         System.out.println(ans);
    }
    public static double printMedian(int[] n1,int[] n2){
        int i=0;
        int j=0;
        int n=n1.length+n2.length;
        int[] ans=new int[n];
        int k=0;
        while(i<n1.length&&j<n2.length){
            if(n1[i]<n2[j]){
               ans[k]=n1[i];
               i++;
               k++;
            }else{
                ans[k]=n2[j];
                j++;
                k++;
            }
        }
        while(i<n1.length){
            ans[k]=n1[i];
            i++;
            k++;
        }
        while(j<n2.length){
            ans[k]=n2[j];
            j++;
            k++;
        }
        int mid=n/2;
        if(n%2==0){
            return (double) ((ans[mid-1]+ans[mid])/2.0);
        }else{
            return (double)(ans[mid])/2.0;
        }
    }
}
