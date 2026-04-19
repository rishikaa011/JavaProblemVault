import java.util.Scanner;
class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double SI = (p * r * t) / 100;
        double CI = p * Math.pow((1 + r/100), t) - p;
        System.out.println("Simple Interest: " + SI);
        System.out.println("Compound Interest: " + CI);
    }
}