package PepInsta.Basic_coding;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=23;
        int count=0;
        if(n<2){
            System.out.println("not a prime nor composite");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("not a prime number");
        }
        else{
            System.out.println("prime number");
        }
    }
}
