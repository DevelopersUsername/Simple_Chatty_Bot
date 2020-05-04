// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count= scanner.nextInt();
        int num = 1;
        int index = 0;

        while (index < count) {
            for (int i = 0; i < num && index++ < count; i++) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}