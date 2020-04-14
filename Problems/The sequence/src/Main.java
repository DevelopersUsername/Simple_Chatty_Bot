import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            if (current % 4 == 0 && current > max) {
                max = current;
            }
        }
        System.out.println(max);
    }
}