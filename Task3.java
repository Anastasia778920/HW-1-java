import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*; 

// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). 
// int a ; int b; String op (op!=”Stop”); (char != ’b’)

public class Task3 {
   public static void main(String[] args) throws IOException {
      Logger logger = Logger.getLogger(Task3.class.getName());
      FileHandler fh = new FileHandler("log.txt");
      logger.addHandler(fh);
      
      SimpleFormatter sFormat = new SimpleFormatter();
      fh.setFormatter(sFormat);
      
      logger.log(Level.WARNING, "Тестовое логирование 1");
      logger.info("Тестовое логирование 2");
{
      int num1;
      int num2;
      int ans;
      char oper;
      try (Scanner reader = new Scanner(System.in)) {
        System.out.print("Введите два числа: ");
          num1 = (int) reader.nextDouble();
          num2 = (int) reader.nextDouble();
          System.out.print("\nВыберите операцию (+, -, *, /): ");
          oper = reader.next().charAt(0);
    }
      switch(oper) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Вы что то не так ввели!");
            return;
      }
      System.out.print("\nОтвет:\n");
      System.out.printf(num1 + " " + oper + " " + num2 + " = " + ans);
   }
}
}
