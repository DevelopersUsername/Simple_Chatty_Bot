// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanuts = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean goodForNormalDays = peanuts >= 10 && peanuts <= 20 && !isWeekend;
        boolean goodForWeekend = peanuts >= 15 && peanuts <= 25 && isWeekend;

        System.out.println(goodForNormalDays || goodForWeekend);
    }
}