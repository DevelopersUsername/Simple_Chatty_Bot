import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2 = ++num;

        System.out.println(num + num2 % 2);
    }
}