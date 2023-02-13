package PepInsta.Basic_coding;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+","+b);
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(","+c);
        }
    }
}
