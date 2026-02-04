import java.util.Scanner;

public class MonitorProducao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int metaProducao = 1000;

        System.out.println("--- MONITOR DE PRODUCAO MOTORS ---");
        System.out.print("Digite a quantidade de pecas produzidas: ");
        
        int produzido = leitor.nextInt();

        if (produzido >= metaProducao) {
            System.out.println("PARABENS! A meta foi atingida.");
        } else {
            int falta = metaProducao - produzido;
            System.out.println("ATENCAO: Meta nao atingida.");
            System.out.println("Ainda faltam " + falta + " pecas.");
        }

        leitor.close();
    }
}