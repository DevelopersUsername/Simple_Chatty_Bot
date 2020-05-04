// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int index = 1;
        int val = 1;
        while (val <= num) {
            System.out.println(val);
            index++;
            val = index * index;
        }
    }
}