package PepInsta.Basic_coding;

public class FactorOfANumber {
    public static void main(String[] args) {
        int n=56;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
