import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(numbers(number, 4, 6, 7, 9, 10, 16));

    }

    public static boolean numbers(int number, int... numbers) {
        for (int san : numbers) {
            if (san == number) {
                return true;
            }
        }
        return false;


    }

}


