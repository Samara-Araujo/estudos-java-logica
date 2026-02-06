import java.util.Scanner;

public class ControleSaidaEstoque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Nossas listas de materiais e saldos
        String[] produtos = {"Cabo Cobre", "Fibra Optica", "Isolante PVC", "Bobina Madeira", "Fitas"};
        int[] quantidade = {10, 5, 8, 12, 20}; 

        System.out.println("=== SISTEMA DE BAIXA DE ESTOQUE ===");
        System.out.print("Qual material saiu? ");
        String busca = leitor.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equalsIgnoreCase(busca)) {
                encontrado = true;
                
                System.out.println("\nProduto: " + produtos[i]);
                System.out.println("Estoque atual: " + quantidade[i]);
                
                System.out.print("Quantas unidades foram retiradas? ");
                int retirada = leitor.nextInt(); 

                // Lógica de subtração com validação
                if (retirada <= quantidade[i]) {
                    quantidade[i] = quantidade[i] - retirada; 
                    System.out.println("✅ BAIXA REALIZADA COM SUCESSO!");
                    System.out.println("Novo saldo de " + produtos[i] + ": " + quantidade[i]);
                } else {
                    System.out.println("❌ Erro: Estoque insuficiente para essa retirada!");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\n❌ Erro: Produto nao encontrado no sistema.");
        }

        leitor.close();
    }
}