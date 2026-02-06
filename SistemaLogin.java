import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        // Ajuste para aceitar acentos na entrada e saída
        Scanner leitor = new Scanner(System.in, "UTF-8");
        
        String[] usuariosAutorizados = {"Samara", "Admin", "Engenharia"};
        
        // Cores ANSI
        String verde = "\u001B[32m";
        String vermelho = "\u001B[31m";
        String reset = "\u001B[0m";

        System.out.println("SISTEMA DE SEGURANCA");
        System.out.print("Usuario: ");
        String tentativaLogin = leitor.nextLine();

        boolean acessoConcedido = false;

        // O "for" percorre a lista para ver se o nome digitado está lá
        for (String usuario : usuariosAutorizados) {
            if (usuario.equalsIgnoreCase(tentativaLogin)) {
                acessoConcedido = true;
                break; // Se achou, não precisa continuar procurando
            }
        }

        if (acessoConcedido) {
            System.out.println(verde + "ACESSO LIBERADO! Bem-vinda, " + tentativaLogin + reset);
        } else {
            System.out.println(vermelho + "ACESSO NEGADO! Usuario nao reconhecido." + reset);
        }

        leitor.close();
    }
}