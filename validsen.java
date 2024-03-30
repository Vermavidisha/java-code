public class validsen{
    public static void main(String[] args){
        String s="A man, a plan, a canal, Panama!";
         System.out.println(checkvalid(s));
    }
    public static boolean checkvalid(String s){
        StringBuilder sb= new StringBuilder("");
        String lowercase=s.toLowerCase();
        for(char ch:lowercase.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                 sb.append(ch);
            }
        }
        String str=sb.toString();
        String reverse= new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}