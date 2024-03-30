public class shortestpath {

    public static void main(String[] args ) {
        String s ="WNEENESENNN";
        System.out.println(findShotestpath(s));
    }
    public static float findShotestpath(String s){
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'){
                x--;
            }
            else if(s.charAt(i)=='N'){
                y++;
            }
            else if(s.charAt(i)=='S'){
                y--;
            }
            else {
                x++; 
            }
        }
         int X2=x*x;
         int Y2=y*y;
         return (float)Math.sqrt(X2+Y2);
    }

}
