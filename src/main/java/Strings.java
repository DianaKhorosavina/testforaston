import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку а");
        String a = in.nextLine();
        System.out.println("Введите b");
        String b = in.nextLine();


        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }
}
