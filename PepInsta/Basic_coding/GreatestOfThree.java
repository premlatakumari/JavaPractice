package PepInsta.Basic_coding;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a=12;
        int b=13;
        int c=45;
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        int max=Math.max(a,b);
        int result=Math.max(max,c);
        System.out.println(result);
    }
}
