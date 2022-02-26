import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        int n;
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương: ");
        n = sc.nextInt();
        while(n <= 0); 
        res = count_digit_of_num(n); 
        System.out.println("The number of digits of " + n + " is " + res); 
        sc.close(); 
    } 
     
    public static int count_digit_of_num(int n) { 
        int cnt = 0; 
        while(n > 0) {
            cnt++;
            n = n/10;
        }
        return cnt;
    }
}
