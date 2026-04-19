import java.util.Scanner;
class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        char c = sc.next().charAt(0);
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Char: " + c);
    }
}