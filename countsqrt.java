public class countsqrt {
    public static void main(String[] args) {
        int n=10;
        int ans=computesqrt(n);
        System.out.println(ans);
    }
    public static int computesqrt(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=n;j++){
                    double s=i*i+j*j;
                    int x=(int)Math.sqrt(s);
                    if(x<=n&&x*x==s){
                        count++;
                    }
            }
        }
        return count;
    }
}
