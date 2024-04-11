import java.util.Scanner;
public class main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Запит на введення трьох дробових чисел
        System.out.println("введіть три дробові числа :");
        double num1, num2, num3; // Отримання трьох введених вами дробових чисел

        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        } else {
            System.out.println("введено не дробове число");
            return;
        }
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        } else {
            System.out.println("введено не дробове число");
            return;
        }
        if (scanner.hasNextDouble()) {      //Перевірка третього числа
            num3 = scanner.nextDouble();
        } else {
            System.out.println("введено не дробове число");
            return;
        }
        // Пошук найбільшого числа
        double max = Math.max(Math.max(num1, num2), num3);
        // Вивід повідомлення про найбільше дробове число
        System.out.println("Найбільше дробове число: " + max);





    }
}
