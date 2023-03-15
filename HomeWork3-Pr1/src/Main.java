import java.util.Scanner;

public class Main {
    // Вывести на экран число.
    // Каждая цифра должна быть  выведена в отдельной строке.
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print(" Введите трехзначное число: ");
        int number = scr.nextInt();
        System.out.println( number / 100 );
        System.out.println( number / 10 % 10 );
        System.out.println(number % 10);
    }
}
