import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите I-ю дробь в формате a/b:");
        String input_1 = scanner.nextLine();
        System.out.println("Введите II-ю дробь в формате a/b:");
        String input_2 = scanner.nextLine();

        Multiply multiply_1 = InputDigit.createMultiply(input_1);
        Multiply multiply_2 = InputDigit.createMultiply(input_2);
        Multiply result = multiply_1.multiply(multiply_2);

        OutputDigit.printResult(result);
    }
}