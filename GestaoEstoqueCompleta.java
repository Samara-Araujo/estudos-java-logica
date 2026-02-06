import java.util.Scanner;

public class GestaoEstoqueCompleta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] produtos = {"Cabo Cobre", "Fibra Optica", "Fitas"};
        int[] quantidade = {10, 5, 20}; 

        System.out.println("=== GESTAO DE ESTOQUE (PRO) ===");
        System.out.print("Qual material deseja movimentar? ");
        String busca = leitor.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equalsIgnoreCase(busca)) {
                encontrado = true;
                
                System.out.println("\nProduto: " + produtos[i] + " | Saldo atual: " + quantidade[i]);
                System.out.println("O que deseja fazer?");
                System.out.println("[1] Retirar material (Saida)");
                System.out.println("[2] Repor material (Entrada)");
                System.out.print("Opcao: ");
                int opcao = leitor.nextInt();

                if (opcao == 1) {
                    // Lógica de Saída (Subtração)
                    System.out.print("Quantidade para SAIDA: ");
                    int valor = leitor.nextInt();
                    if (valor <= quantidade[i]) {
                        quantidade[i] -= valor; // Atalho para: quantidade[i] = quantidade[i] - valor
                        System.out.println("✅ Saida registrada! Novo saldo: " + quantidade[i]);
                    } else {
                        System.out.println("❌ Erro: Saldo insuficiente!");
                    }
                } else if (opcao == 2) {
                    // Lógica de Entrada (Soma)
                    System.out.print("Quantidade para ENTRADA: ");
                    int valor = leitor.nextInt();
                    quantidade[i] += valor; // Atalho para: quantidade[i] = quantidade[i] + valor
                    System.out.println("✅ Estoque abastecido Novo saldo: " + quantidade[i]);
                } else {
                    System.out.println("❌ Opcao invalida.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("❌ Produto nao encontrado.");
        }

        leitor.close();
    }
}
