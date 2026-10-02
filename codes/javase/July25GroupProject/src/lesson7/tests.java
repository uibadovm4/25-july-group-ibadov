package lesson7;

public class tests {
    public static void main(String[] args) {

        int a = 12;
        int b = 5;

        a += b++; // a=17, b=6
        b *= 2;   // b=12
        a -= --b; // b=11, a=6
        a /= 3;   // a=2

        System.out.println(a);
        System.out.println(b);

        int x = 8;
        int y = 3;

        int z = x++ + ++y; // y=4, z=12, x=9
        x += z % 4;        // x=9
        y *= x - 5;        // y=16

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        int c_a = 10;
        int c_b = 4;

        int c = c_a++ - --c_b; // c_b=3, c=7, c_a=11
        c_a += ++c_b;          // c_b=4, c_a=15
        c_b = c_a % c_b;       // c_b=3
        c *= c_a--;            // c=105, c_a=14

        System.out.println(c_a);
        System.out.println(c_b);
        System.out.println(c);
    }
}
