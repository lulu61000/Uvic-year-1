// Shadowing.java
//

// Q1a. What will the output of this program be?
public class Shadowing {
    static int x;

    public static void main (String[] args) {
        x = 10;
        foo(20);
        System.out.println(", in main, x: " + x);
    }

    public static void foo(int x) {
        x = x + 5;
        System.out.print("in foo, x: " + x);
    }
}
