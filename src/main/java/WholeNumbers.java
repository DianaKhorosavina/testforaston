
import java.util.Scanner;

public class WholeNumbers {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = Integer.parseInt(in.nextLine());
        System.out.println("Введите число b");
        int b = Integer.parseInt(in.nextLine());


        if (a > b) {
            System.out.println("а больше чем b");
        } else if (b > a) {
            System.out.println("b больше чем a");
        } else System.out.println("a и b равны");

        int i = a + b;
        int c = a + b;
        int y = a * b;
        int d = a / b;
        System.out.println("Сложение = " + i);
        System.out.println("Вычитание = " + c);
        System.out.println("Умножение = " + y);
        System.out.println("Деление = " + d);
    }
}


