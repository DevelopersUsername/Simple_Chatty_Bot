import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean ascending = false;
        boolean descending = false;

        while (scanner.hasNext()) {
            int lastValue = value;
            value = scanner.nextInt();
            if (value == 0) {
                break;
            } else if (lastValue < value) {
                ascending = true;
            } else if (value < lastValue) {
                descending = true;
            }
        }
        System.out.println(!ascending || !descending);
    }
}