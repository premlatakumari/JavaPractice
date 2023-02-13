package PepInsta.Basic_coding;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n=57;
        if((n*n)%10==n%10){
            System.out.println("automorphic Number");
        }
        else {
            System.out.println("Not a automorphic number");
        }
    }
}
