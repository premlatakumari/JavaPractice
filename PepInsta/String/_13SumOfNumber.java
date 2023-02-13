package PepInsta.String;

public class _13SumOfNumber {
    public static void main(String[] args) {
        String s ="4PREP2INSTAA6";
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z'))
            {
                continue;
            }
            System.out.println(ch);
            ans+=Character.getNumericValue(ch);
        }
        System.out.println(ans);
    }
}
