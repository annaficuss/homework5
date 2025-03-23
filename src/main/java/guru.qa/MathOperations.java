package guru.qa;

public class MathOperations {

    public static void main(String[] args) {

        int a = 6;
        int b = 9;
        double c = 5.5;
        float d = Float.MAX_VALUE;

        System.out.println("Арифметические операции над двумя примитивами типа int: ");
        System.out.println((a - b) * 6);
        System.out.println((a + b) / 2);

        System.out.println("Арифметические операции над int и double в одном выражении: ");
        System.out.println((a - c) * 6);
        System.out.println((a + c) / 2);

        System.out.println("Логические операции ");
        System.out.println(a >= b);
        System.out.println(b == c);

        System.out.println("Диапазоны типов данных для вещественных чисел: ");
        System.out.println("Максимальное значение float: " + Float.MAX_VALUE);
        System.out.println("Минимальное значение float: " + Float.MIN_VALUE);
        System.out.println("Максимальное значение double: " + Double.MAX_VALUE);
        System.out.println("Минимальное значение double: " + Double.MIN_VALUE);

        System.out.println("Получить переполнение при арифметической операции ");
        System.out.println(d * 6);
    }
}
