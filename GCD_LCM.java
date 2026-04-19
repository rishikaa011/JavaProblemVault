import java.util.Scanner;
class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0) gcd=i;
        }
        int lcm = (a*b)/gcd;
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);
    }
}