package PepInsta.Recursion;

public class PowerOfANumber {
    public static int power(int n,int pow){
        if(pow==0)
            return 1;
        return n*power(n,pow-1);
    }
    public static void main(String[] args) {
        int n=4;
        int pow=12;
        System.out.println(power(n,pow));
    }
}
