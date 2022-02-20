import java.util.Scanner;
public class convertdegrees {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите количество градусов Цельсия: ");
        int number1 = k.nextInt();
        System.out.print((number1 * 1.8) + 32);
        }
    }
