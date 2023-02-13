package working_number;

public class LowestCommon 
{
    public static void main(String args[])
    {
    int a=24;
    int b=30;
    int ans=0;
    int max=a>b?a:b;
    for(int i=max;i<=a*b;i++){
        if(i%a==0 && i%b==0){
            ans=i;
            //break;
        }
    }
    System.out.println(ans);
}
}
