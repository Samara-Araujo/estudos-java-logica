import java.util.Scanner;

public class LocalizadorEstoque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Nossas "gavetas" (Arrays) - O item na posição 0 de uma corresponde à posição 0 da outra
        String[] produtos = {"Cabo Cobre", "Fibra Optica", "Isolante PVC", "Bobina Madeira", "Fitas"};
        String[] locais = {"Corredor A - Nivel 4", "Corredor B - Nivel 2", "Setor Quimico", "Patio Externo", "Corredor C - Nivel 5"};
        int[] quantidade = {3, 5, 2, 12, 1};

        System.out.println("=== SISTEMA DE BUSCA DE ENDERECO (SAP SIMULATOR) ===");
        System.out.print("Digite o nome do material para localizar: ");
        String busca = leitor.nextLine();

        boolean encontrado = false;

        // O loop 'for' agora usa um contador 'i' para sabermos a posição (índice)
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equalsIgnoreCase(busca)) {
                System.out.println("MATERIAL LOCALIZADO");
                System.out.println("Produto: " + produtos[i]);
                System.out.println("Localizacao: " + locais[i]); // Puxa o local na mesma posição
                System.out.println("Quantidade: " + quantidade[i]);
                if (quantidade[i] < 3) { System.out.println("ALERTA: Estoque Baixo!"); }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\n❌ Erro: Material '" + busca + "' nao encontrado no inventario.");
        }

        leitor.close();
    }
}
