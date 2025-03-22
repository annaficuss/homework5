package guru.qa;

public class MathOperations {

    public static void main(String[] args) {

        int a = 6;
        int b = 9;
        double c = 5.5;
        int d = 2147483647;


        System.out.println("Задание 0");
        System.out.println((a - b) * 6);
        System.out.println((a + b) / 2);

        System.out.println("Задание 1");
        System.out.println((a - c) * 6);
        System.out.println((a + c) / 2);

        System.out.println("Задание 2");
        System.out.println(a >= b);
        System.out.println(b == c);

        System.out.println("Задание 4");
        System.out.println(d + 1);
    }
}
