package PepInsta.String;

public class _11RemoveSpaces {
    public static void main(String[] args) {
        String str= "Somee Singh  I a m Fr   om";
        String ans="";
        str=str.replaceAll(" ","");
        System.out.println(str);
    }
}
