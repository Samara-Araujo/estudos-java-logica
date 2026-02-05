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

        // Lógica de decisão
        if (estoqueAtual > estoqueMinimo) {
            System.out.println("SITUACAO: Estoque OK.");
        } else if (estoqueAtual == estoqueMinimo) {
            System.out.println("SITUACAO: Atencao! Estoque no limite.");
        } else {
            System.out.println("SITUACAO: CRITICA! Realizar pedido de compra.");
        }

        input.close();
    }
}