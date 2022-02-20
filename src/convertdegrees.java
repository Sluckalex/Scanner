import java.util.Scanner;

public class convertdegrees {
    public static void main(String[] args) {
        Scanner cels = new Scanner(System.in);
        System.out.println("Введите количество градусов Цельсия:(целое число) ");
        int number = cels.nextInt();
        System.out.print("В "+ number + " градусов цельсия = " + ((number * 1.8) + 32) + " градусов по Фаренгейту ");
    }
}
