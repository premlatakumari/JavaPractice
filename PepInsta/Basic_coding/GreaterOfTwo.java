package PepInsta.Basic_coding;

public class GreaterOfTwo {
    public static void main(String[] args) {
        int a=8;
        int b=45;
        //1st method

        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

        //2nd method
        int ans=Math.max(a,b);
        System.out.println(ans);

        //3rd method
        int ans1=a>b?a:b;
        System.out.println(ans1);

    }
}
