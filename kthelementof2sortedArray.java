import java.util.Arrays;

public class kthelementof2sortedArray {
    public static void main(String[] argv){
        int[] nums1={2,5};
        int[] nums2={3,4};
            long k=2;
        System.out.println(kthelement(nums1,nums2,k));
    }
    public static long kthelement(int[] nums1,int[] nums2,long k){
    long[] products = new long[nums1.length * nums2.length];
        int index = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                products[index++] = (long) num1 * num2;
            }
        }
        Arrays.sort(products);
       int a=(int)k-1;
        return products[a];
    }
}
