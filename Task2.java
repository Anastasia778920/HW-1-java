import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int input = iScanner.nextInt();
        iScanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true; 
            for (int p = 2; p < i; p++) {
                if (i % p == 0) {
                    isPrimeNumber = false; 
                    break;

                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}