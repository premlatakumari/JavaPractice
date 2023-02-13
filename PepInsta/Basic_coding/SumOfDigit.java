package PepInsta.Basic_coding;

public class SumOfDigit {
    public static void main(String[] args) {
        int n=34523;
        int sum=0;
        while (n>0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
