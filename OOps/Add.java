package OOps;

public class Add {
    int a;
    int b;
    public Add(int a, int b){
        this.a=a;
        this.b=b;

    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(new Add(a,b));
    }
}
