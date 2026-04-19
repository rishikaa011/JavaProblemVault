import java.util.Scanner;
class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float f = (c * 9/5) + 32;
        System.out.println("Fahrenheit: " + f);
        f = sc.nextFloat();
        c = (f - 32) * 5/9;
        System.out.println("Celsius: " + c);
    }
}