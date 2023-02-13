package OOps;
public class StaticUse {
    public class StaticDemo {
        static int a = 42;
        static int b = 99;

        static void callme() {
            System.out.println("a = " + a);
        }
    }
    public class Demo1 {
        public static void main(String[] s) {
            StaticDemo.callme();
            System.out.print("b = " + StaticDemo.b);
        }
    }

    public static void main(String[] args) {
        System.out.println(StaticDemo.a);

    }
}
