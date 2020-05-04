// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < count; i++) {
            int size = scanner.nextInt();
            if (size == 0) {
                perfect++;
            } else if (size > 0) {
                larger++;
            } else {
                smaller++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}