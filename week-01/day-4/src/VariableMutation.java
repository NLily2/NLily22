
public class VariableMutation {
    public static void main(String[] args) {
        int a = 3 + 10;
        System.out.println(a);
        int b = 100 - 7;
        System.out.println(b);
        int c = 44 * 2;
        System.out.println(c);
        int d = 125 / 5;
        System.out.println(d);
        int e = 8 * 8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f = (f1 > f2);
            System.out.println(a);

        int g1 = 350;
        int g2 = 200;
        boolean g = (g2*2 > g1);
        System.out.println(g);

        int h1 = 135798745;
        boolean h = (h1 % 11 == 0);
        System.out.println(h);

        int i1 = 10;
        int i2 = 3;
        boolean i = (i1 > Math.pow(i2, 2)) && (i1 < Math.pow(i2, 3));
        System.out.println(i);

        int j1 = 1521;
        boolean j = (j1 % 3 == 0 || j1 % 5 == 0);
        System.out.println(j);

        String k = "Apple";

    }
}
