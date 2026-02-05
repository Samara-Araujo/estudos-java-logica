import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEMA DE ESTOQUE INDUSTRIAL");

        System.out.print("Nome do Item: ");
        String nomeItem = input.nextLine();

        System.out.print("Quantidade atual em estoque: ");
        int estoqueAtual = input.nextInt();

        System.out.print("Quantidade minima de seguranca: ");
        int estoqueMinimo = input.nextInt();

        System.out.println("STATUS DO ITEM: " + nomeItem.toUpperCase()); 
        System.out.println("Quantidade: " + estoqueAtual + " unidades.");

      // Códigos de Cores ANSI
        String verde = "\u001B[32m";
        String amarelo = "\u001B[33m";
        String vermelho = "\u001B[31m";
        String reset = "\u001B[0m"; // Volta para a cor padrão

        System.out.println("STATUS DO ITEM: " + nomeItem.toUpperCase());
        System.out.println("Quantidade: " + estoqueAtual + " unidades.");

        // Lógica de decisão com CORES
        if (estoqueAtual > estoqueMinimo) {
            System.out.println("SITUACAO: " + verde + "Estoque OK." + reset);
        } else if (estoqueAtual == estoqueMinimo) {
            System.out.println("SITUACAO: " + amarelo + "Atencao! Estoque no limite." + reset);
        } else {
            System.out.println("SITUACAO: " + vermelho + "CRITICA! Realizar pedido de compra." + reset);
        }
    }
}