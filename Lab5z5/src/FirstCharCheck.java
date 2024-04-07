public class FirstCharCheck {
    public static void main(String []args){
        System.out.println(repFirstChar("@est"));
    }
    public static String repFirstChar(String s){
        char c=s.charAt(0);
        if(c>64&&c<91){
            return "upper";
        }
        else if(c>96&&c<123){
            return "lower";
        }
        else if(c>47&&c<58){
            return"digit";
        }
        else{
            return "other";
        }
    }
}
