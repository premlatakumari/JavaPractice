package PepInsta.String;

public class _14CaptalizeFirstAndLastCharcter {
    public static void main(String[] args) {
        String s="prep inst is best";
        String str[]=s.split(" ");
        String ans="";
        for (String i:str)
        {
            for(int j=0;j<i.length();j++){
                if(j==0 || j==i.length()-1)
                {
                    ans+=String.valueOf(i.charAt(j)).toUpperCase();
                }
                else{
                    ans+=i.charAt(j);
                }
            }
            ans+=" ";
        }
        System.out.println(ans+" ");



    }
}
