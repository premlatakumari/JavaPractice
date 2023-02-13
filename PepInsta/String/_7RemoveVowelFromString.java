package PepInsta.String;

public class _7RemoveVowelFromString {
    public static void main(String[] args) {
        String str="Somee Singh";
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='A' || ch=='E'||ch=='I' || ch=='O'||ch=='U' || ch=='a'||ch=='e' || ch=='i'||ch=='o' || ch=='u')
            {
               continue;
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}
