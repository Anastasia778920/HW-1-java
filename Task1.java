import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
/**
 * Task1
 */


public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число будет равно: %d\n", giveMeNumber(i));
        iScanner.close();
    }
    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;

    }
}
