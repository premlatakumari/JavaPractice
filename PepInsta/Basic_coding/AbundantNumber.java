package PepInsta.Basic_coding;

public class AbundantNumber {
    public static void main(String[] args) {
        int n=18;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("Yes, it is an abundant number");
        }
        else {
            System.out.println("no it is not a abundant number");
        }
    }

    public static class PrimeNumber {
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
}
