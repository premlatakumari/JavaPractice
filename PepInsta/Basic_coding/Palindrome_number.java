package PepInsta.Basic_coding;

public class Palindrome_number {
    public static void main(String[] args) {
        int n=12133;
        int num=n;
        int rev=0;
        while (num>0){
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}

