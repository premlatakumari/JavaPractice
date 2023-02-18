package PepInsta.working_number;

public class BinaryToDecimal {
    public static void main(String args[]){
        int a=101;
        int ans=0;
        int n=0;
        while(a>0){
            int temp=a%10;
            ans+=temp*Math.pow(2,n);
            a=a/10;
            n++;
        }
        System.out.println(ans);

    }
}
