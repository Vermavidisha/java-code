public class sumofnthrowpascal {
    public static void main(String[] argv){
        int row=4;
        System.out.println(sum(row));
    }
    public static long sum(int n){
        return (long)Math.pow(2,n);
    }
}
