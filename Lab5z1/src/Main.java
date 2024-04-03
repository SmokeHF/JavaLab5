public class Main {
    public static String pluses(int n){
        char[] chars=new char[n];
        boolean plus=true;
        for(int i=0;i<n;i++){
            if(plus) {
                chars[i] = '+';
                plus = false;
            }
            else{
                chars[i]='-';
                plus=true;
            }
        }
       String a=new String(chars);
        return a;
    }
    public static void main(String[] args) {
        System.out.println(pluses(7));
    }
}