import java.util.Scanner;

public class XPrascunho{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Moto de gamificação funcionaŕa em 3 etapas sequenciais

//1
//Deve pedir uma senha numerica em loop, enquanto a senha for diferente de 2026, ele vai imprimir "Acesso negado" e pedir novamente
//quando digitar 2026 vai aparece "Acesso liberado! Bem-Vindo ao seu Tracker de rotina"

        System.out.println("Digite a senha de acesso: ");
        int senha = teclado.nextInt();

        while (senha != 2026) {
            System.out.println("Acesso Negado! Tente novamente...");
            senha = teclado.nextInt();
        }

        System.out.println("Acesso liberado! Bem-vindo ao seu Tracker de Rotina");

//2.
//Digite a quantidade de XP ganha em uma atividade concluida
//Programa vai perguntar se ele deseja registrar uma atividade? (1-Sim / 2-Não). Se digitar 1 ele vai pedir o XP da nova atividade, se for 2 ele vai encerrar esta etapa 2

        int totalAtividades = 0;
        int xptotal = 0;
        int atividades_epicas = 0;

        int opcao = 1;

        while (opcao == 1) {
            System.out.println("Digite o XP da atividade concluída");
            int xpatual = teclado.nextInt();

            xptotal += xpatual;

            totalAtividades++;

            if (xpatual > 100) {
                atividades_epicas++;
            }
            System.out.println("Deseja registrar mais uma atividade? (1-Sim / 2-Não)");
            opcao = teclado.nextInt();
        }

        System.out.println("---RELATÓRIO DO DIA---");
        System.out.println("Atividades concluídas: " + totalAtividades);
        System.out.println("Atividades épicas: " + atividades_epicas);
        System.out.println("XP Total acumulado: " + xptotal);
        

//3.
//quando o usuario digitar 2 para sair e imprimir:
//Total de atividades feitas
//XP total acumulado
//Quantidade de atividades épicas

        System.out.println("---PROJEÇÃO PARA OS PRÓXIMOS NÍVEIS---");

        for (int nivel = 1; nivel <= 5; nivel++) {
            int xpnecessario = xptotal * nivel;
            System.out.printf("Nível %d exige %d XP", nivel, xpnecessario);
        }

//4. 
//Por fim, programa dee mostrar projeção de níveis, sabendo "Custo de XP" para subir de nível, sendo sempre tabuada do seu XP vezes o número do nível, usar laço for para imprimir os proximos níveis
//Nível 1: [XP Total] x 1 = [Resultado]

//Nível 2: [XP Total] x 2 = [Resultado]

//... até o Nível 5.






        teclado.close();
    }
}