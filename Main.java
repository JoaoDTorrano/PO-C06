public class Main {
    public static void main(String[] args) {
        System.out.println(calculaFatorial(5));
        mostraPares(10);
    }
    public static int calculaFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void mostraPares(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
