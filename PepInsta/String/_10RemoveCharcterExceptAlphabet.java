package PepInsta.String;

public class _10RemoveCharcterExceptAlphabet {
    public static void main(String[] args) {
        String s = "hel1456lo56wor%^ld";
        s=s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);
    }
}
