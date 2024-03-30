public class strpalindrome {
     public static void main(String[] args) {
    String s = "race a car";
    System.out.print(checkpalindrome(s));
     }
     public static boolean checkpalindrome(String s){
             int n=s.length();
             for(int i=0;i<s.length()/2;i++){
               if(s.charAt(i)!=s.charAt(n-i-1)){
                  return false;
               }
             }
       return true;
     }
}
