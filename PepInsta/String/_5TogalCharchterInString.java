package PepInsta.String;

public class _5TogalCharchterInString {
    public static void main(String[] args) {
        String str="Somee Singh ";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                ans=ans+Character.toLowerCase(str.charAt(i));
            }
            else{
                ans+=Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
