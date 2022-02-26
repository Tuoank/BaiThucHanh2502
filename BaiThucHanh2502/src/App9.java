import java.util.Scanner;
public class App9 {
    private static int so_DN(int n) {
        int soDN = 0;
        while (n > 0) {
            soDN = soDN * 10 + n % 10;
            n /= 10;
        }
        return soDN;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương : ");
        a = sc.nextInt();
        b = so_DN(a);
        sc.close();
        System.out.println("Số đảo ngược là: "+b);
    }       
}
