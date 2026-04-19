import java.util.Scanner;
class StrongNumber {
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum=0, temp=n;
        while(n>0){
            int d=n%10;
            sum+=fact(d);
            n/=10;
        }
        System.out.println(sum==temp?"Strong":"Not Strong");
    }
}