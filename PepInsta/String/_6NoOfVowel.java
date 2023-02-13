package PepInsta.String;

public class _6NoOfVowel {
    public static void main(String[] args) {
        String str="Somee Singh";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='A' || ch=='E'||ch=='I' || ch=='O'||ch=='U' || ch=='a'||ch=='e' || ch=='i'||ch=='o' || ch=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
