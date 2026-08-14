import java.util.Scanner;

public class XP{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a senha de acesso: ");
        int senha = teclado.nextInt();

        while (senha != 2026) {
            System.out.println("Acesso Negado! Tente novamente...");
            senha = teclado.nextInt();
        }

        System.out.println("Acesso liberado! Bem-vindo ao seu Tracker de Rotina");

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

        System.out.println("---PROJEÇÃO PARA OS PRÓXIMOS NÍVEIS---");

        for (int nivel = 1; nivel <= 5; nivel++) {
            int xpnecessario = xptotal * nivel;
            System.out.printf("Nível %d exige %d XP", nivel, xpnecessario);
        }

        teclado.close();
    }
}