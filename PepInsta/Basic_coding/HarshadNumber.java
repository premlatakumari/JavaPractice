package PepInsta.Basic_coding;

public class HarshadNumber {
    public static void main(String[] args) {
        int num=153;
        int n=num;
        int sum=0;
        while (n>0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        if(num%sum==0){
            System.out.println("Harshad Number");
        }
        else {
            System.out.println("not a Harshad Number");
        }
    }
}
