import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = tec.nextDouble();
            while (salario < 0) {
                salario = tec.nextDouble()
            }

            if (salario >= 0 && salario <= 400.00) {
                double sal = salario * 1.15;
                System.out.printf("Novo salario: %.2f%n", sal);
                System.out.printf("Reajuste ganho: %.2f%n", salario - sal);
                int percent = (sal*100)/salario;
                System.out.printf("Em percentual: %d%n", percent);
            } else if (salario >= 400.01 && salario <= 800.00) {
                double sal = salario * 1.12;
                System.out.printf("Novo salario: %.2f%n", sal);
                System.out.printf("Reajuste ganho: %.2f%n", salario - sal);
                int percent = (sal*100)/salario;
                System.out.printf("Em percentual: %d%n", percent);
            } else if (salario >= 800.01 && salario <= 1200.00) {
                double sal = salario * 1.10;
                System.out.printf("Novo salario: %.2f%n", sal);
                System.out.printf("Reajuste ganho: %.2f%n", salario - sal);
                int percent = (sal*100)/salario;
                System.out.printf("Em percentual: %d%n", percent);
            } else if (salario >= 1200.01 && salario <= 2000.00) {
                double sal = salario * 1.07;
                System.out.printf("Novo salario: %.2f%n", sal);
                System.out.printf("Reajuste ganho: %.2f%n", salario - sal);
                int percent = (sal*100)/salario;
                System.out.printf("Em percentual: %d%n", percent);
            } else {
                double sal = salario * 1.04;
                System.out.printf("Novo salario: %.2f%n", sal);
                System.out.printf("Reajuste ganho: %.2f%n", salario - sal);
                int percent = (sal*100)/salario;
                System.out.printf("Em percentual: %d%n", percent);
            }

            tec.close();
    }
}