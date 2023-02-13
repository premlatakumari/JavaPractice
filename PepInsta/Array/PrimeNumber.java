package PepInsta.Array;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=7;
        int count=0;
        int i;
        for( i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" prime number");
        }
        else{
            System.out.println("not a prime number");
        }

    }
}
