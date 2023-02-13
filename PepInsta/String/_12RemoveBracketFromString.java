package PepInsta.String;

public class _12RemoveBracketFromString {
    public static void main(String[] args) {
        String str="[Som}Sing{{{were)sfd]";
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='[' || ch==']'||ch=='(' || ch==')'||ch=='{' || ch=='}'){
                continue;
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}
