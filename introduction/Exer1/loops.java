import java.io.IOException;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        /* 
        EXERCÍCIO 1 - 1059
        System.out.println("Imprima os números pares de 1 a 100");

        for (int num = 1; num <=100; num++) {
            if (num % 2 == 0) {
                System.out.printf("%d\n", num);

            }
        }
        */
        /* 
        //Exercício 2 - 1067
        System.out.println("Digite um valor de 1 até 1.000: ");
        int X = teclado.nextInt();

        if ((X < 1) || (X > 1000)) {
            System.out.println("Valor incorreto, digite novamente um valor de 1 até 1000.");
        } else {
                for (int numero = 1; numero <= X; numero++) {
                    if (numero % 2 != 0) {
                        System.out.printf("%d\n", numero);
                    }
                }
        }
        */

        //1078
        //Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
        //1 x N = N      2 x N = 2N        ...       10 x N = 10N

//A entrada contém um valor inteiro N (2 < N < 1000).

//Imprima a tabuada de N, conforme o exemplo fornecido.

        System.out.println("Digite um valor inteiro maior que 2 e menor do que 1000 para fazermos a tabuada do 1 até 10 desse respectivo valor: ");
        int n = teclado.nextInt();

        if ((n < 2) || (n > 1000)) {
            System.out.println("Valor inválido, tente novamente");
        } else {
            for(int tab = 1; )
        }


        teclado.close();



    }
}
