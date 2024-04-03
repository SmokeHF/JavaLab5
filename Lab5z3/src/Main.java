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
                arr[i]=i;
                positive=false;
            }
            else{
                arr[i]=-i;
                positive=true;
            }
            i++;
        }
        System.out.println(arr);
    }
}