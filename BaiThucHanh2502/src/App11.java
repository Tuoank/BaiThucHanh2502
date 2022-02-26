public class App11 {
    public static void main(String[] args) { 
    int a, b, c;
    for (a = 0; a <= 200; ++a) {
        for (b = 0; b <= 100; ++b) {
            for (c = 0; c <= 40; ++c) {
                if (a * 10000 + b * 20000 + c * 50000 == 200000) {
                    System.out.println("số tờ 10.000 " + a + " , số tờ 20.000 " + b + " , số tờ 50.000 " + c);
                }                 
            }
        }
    }
} 
}        
                   

