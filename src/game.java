import java.util.Scanner;

public class game {
    public static void main(String[] args) {
int attempts = 0;
        int number = (int) (Math.random() * 100 + 1);
        while (true) {
            attempts = attempts + 1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число от 1 до 100:");
            int gessnumber = sc.nextInt();
            if (gessnumber == 0) {
                System.out.print("Неверное число");
                break;
            }
            if (gessnumber > number) {
                System.out.println("Число меньше");
            } else if (gessnumber < number) {
                System.out.println("Число больше");
            } else {
                System.out.println("Поздравляю, ты угадал !!! ");
                System.out.println("Количество попыток : " + attempts);
                break;
            }
        }
    }
}