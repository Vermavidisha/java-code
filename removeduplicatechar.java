public class removeduplicatechar {
    public static void main(String[] argv){
        String s="abc";
        System.out.println(removeduplicate(s));
    }
    public static String removeduplicate(String s){
        StringBuilder sb=new StringBuilder("");
        char charpre=s.charAt(0);
        sb.append(charpre);
        for(int i=1;i<s.length();i++){
            char present=s.charAt(i);
            if(present!=charpre){
                sb.append(present);
                charpre=present;
            }
        }
        return sb.toString();
    }
}
