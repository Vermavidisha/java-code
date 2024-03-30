public class printpreffix {
    public static void main(String[] argv){
        String[] s = {"flower","flow","flight"};
        System.out.println(commonpreffix(s));
    }
    public static String commonpreffix(String[] s){
        if(s.length==0 || s==null){
              return " ";
        }
        String preffix=s[0];
        for(int i=1;i<s.length;i++){
           while(s[i].indexOf(preffix)!=0){
            preffix=preffix.substring(0, preffix.length()-1);
            if(preffix.isEmpty()){
                return "";
            }
           }
        }
        return preffix;
    }
}
