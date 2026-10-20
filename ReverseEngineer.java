import java.util.Scanner;

public class ReverseEngineer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("ENGENHARIA REVERSA + CONCEITOS DE MEMÓRIA NA PRÁTICA");
    System.out.println();

    int numerador = LerValido("Digite um valor inteiro para ser numerador (32 bits): ", scanner);
    int denominador = LerValido("Digite o denominador (deve ser diferente de 0): ");

    while (denominador == 0) {
      System.out.println("[ERRO DE HARDWARE] Divisão por zero é indefinida");
      denominador = LerValido("digite outro denominador: ", scanner);
    }
    
    


  }
}