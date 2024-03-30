import java.util.HashSet;
import java.util.List;
public class longestcommonsubseq {
    public static void main(String[] argv){
        String text1 = "abcde";
        String text2 = "ace";
        int ans=commonsubstring(text1,text2);
        System.out.println(ans);
    }
    public static int commonsubString(String text1,String text2){
        HashSet<String>ans=new HashSet<>();
        if(text1.length()<0||text2.length()<2){
            return 0;
        }
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    ans.add(text1.charAt(i));                }
            }
        }
        return ans.size();
    }
}
