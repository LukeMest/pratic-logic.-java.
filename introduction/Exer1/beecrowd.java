import java.util.Scanner;
import java.io.IOException;

public class beecrowd {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        /* 
        System.out.println("Digite dois valores para verifica se eles sao mutaplos ou nao: ");
        int a = teclado.nextInt();

        System.out.println("Digite valor B: ");
        int b = teclado.nextInt();

        if (b % a == 0 || a % b == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
        */

        /* 
        System.out.println("Digite DDD: ");
        int ddd = teclado.nextInt();

        switch (ddd) {
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Rio de Janeiro");
                break;
            case 19:
                System.out.println("Juiz de Fora");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }
        */
       /* 
        System.out.println("Defina 3 caracaterísticas do seu animal, sendo elas: vertebrado/invertebrado -> ave/mamifero/inseto/anelideo -> Carnivoro/onivoro/herbivoro/hematofogo/herbivoro");
        String animal1 = teclado.nextLine().toLowerCase();
        String animal2 = teclado.nextLine().toLowerCase();
        String animal3 = teclado.nextLine().toLowerCase();

        if (animal1.equals("vertebrado")) {

            switch (animal2) {
                case "ave":
                    if (animal3.equals("carnivoro")) {
                        System.out.println("aguia");
                    } else {
                        System.out.println("pomba");
                    }
                    break;
                case "mamifero":
                    if (animal3.equals("onivoro")) {
                        System.out.println("homem");
                    } else {
                        System.out.println("vaca");
                    }
                    break;
            }
        } else {
            switch (animal2){
                case "inseto":
                    if (animal3.equals("hematofago")) {
                        System.out.println("pulga");
                    } else {
                        System.out.println("lagarta");
                    }
                    break;
                case "anelideo":
                    if (animal3.equals("hematofago")) {
                        System.out.println("sanguessuga");
                    } else {
                        System.out.println("minhoca");
                    }
                    break;
            }
        }
        */
        teclado.close();
    }
}   


