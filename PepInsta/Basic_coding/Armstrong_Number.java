package PepInsta.Basic_coding;

public class Armstrong_Number {
    public static void main(String[] args) {
        int onum=371;
        int num=onum;
        int n=num;
        int count=0;
        while (n>0){
            int r=n%10;
            count++;
            n=n/10;
        }
        int ans=0;
        while(num>0){
            int r=num%10;
            ans+=Math.pow(r,count);
            num=num/10;
        }
        if(ans==onum){
            System.out.println("it's a armstong number");
        }
        else{
            System.out.println("its not a armstron number");
        }
    }
}
