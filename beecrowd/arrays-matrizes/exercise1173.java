import java.util.Scanner;

public class exercise1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int V = sc.nextInt();
        while (V > 50) {
            System.out.println("Tente um valor menor que 50:");
            V = sc.nextInt();
        }
        N[0] = V;
        System.out.println("N[0] = " + N[0]);
        for (int i = 1; i < 10; i++) {
            N[i] =  2 * N[i - 1];
            System.out.println("N[" + i + "] = " + "" + N[i]);
        }
        sc.close();
    }
}