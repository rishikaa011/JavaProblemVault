import java.util.Scanner;
class DaysConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remainingDays = (days % 365) % 7;
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDays);
    }
}