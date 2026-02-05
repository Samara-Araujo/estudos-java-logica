import java.util.Scanner;

public class CalculadoraEficiencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("GESTAO DE EFICIENCIA");
        
        System.out.print("Nome da Maquina: ");
        String maquina = input.nextLine();

        System.out.print("Tempo Total do Turno (min): ");
        double tempoTotal = input.nextDouble();

        System.out.print("Tempo de Parada (min): ");
        double tempoParada = input.nextDouble();

        // Lógica: Tempo que ela realmente trabalhou
        double tempoAtivo = tempoTotal - tempoParada;
        
        // Cálculo da Eficiência em %
        double eficiencia = (tempoAtivo / tempoTotal) * 100;

        System.out.println("RELATORIO FINAL");
        System.out.println("Maquina: " + maquina);
        System.out.println("Eficiência Real: " + eficiencia + "%");

        if (eficiencia < 80) {
            System.out.println("ALERTA: Eficiencia abaixo da meta!");
        } else {
            System.out.println("DESEMPENHO: Dentro dos padroes.");
        }

        input.close();
    }
}