package PepInsta.Basic_coding;

public class PerfactSquare {
    public static void main(String[] args) {
        int n=41;
        boolean sign=false;
        for(int i=1;i<=n;i++){
            if(i*i==n){
                sign=true;
            }
        }
        if(sign==true){
            System.out.println("yes, it is a perfect square");
        }
        else{
            System.out.println("nope it is not a perfect square");
        }
    }
}
