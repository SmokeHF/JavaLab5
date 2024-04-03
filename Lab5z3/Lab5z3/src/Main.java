import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int n=7;
        int[]arr=new int[n];
        boolean positive=true;
        int i=0;
        if(n%2==1){
            i=1;
            arr[0]=0;
        }
        while(i<n){
            if(positive==true){
                arr[i]=(i+1)/2;
                positive=false;
            }
            else{
                arr[i]=-(i/2);
                positive=true;
            }

            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}