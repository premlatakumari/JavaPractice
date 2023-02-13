//package working_number;

public class lcm {
    public static void main(String args[]) {
        int a=10;
        int b=5;
        int ans=0;
        int min=a<b?a:b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                ans=i;
                
            }
        }
        System.out.println(ans);
       }
    
}
