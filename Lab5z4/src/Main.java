import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n=9453;
        int remainder=1;
        int[] nums=new int[5];
        int size=0;
        int max=0;
        int maxindex=0;
        int[] finalarr;
        if(n==0){
            nums[0]=0;
            size=1;
        }
        while(n!=0){
            remainder=n%10;
            n=(int)(n/10);
            nums[size]=remainder;
            size+=1;
        }
        finalarr=new int[size];
        for(int i=0;i<size;i++){
            max=nums[0];
            maxindex=0;
            for(int k=0;k<size;k++){
                if(nums[k]>max){
                    max=nums[k];
                    maxindex=k;
                }
            }
            finalarr[i]=max;
            nums[maxindex]=-1;
        }
        System.out.println(Arrays.toString(finalarr));
    }
}