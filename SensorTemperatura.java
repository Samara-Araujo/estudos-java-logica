public class SensorTemperatura {
    // Atributos
    String localizacao;
    double temperaturaAtual;

    // Metodo para exibir o status
    public void checarStatus() {
        String reset = "\u001B[0m";
        String vermelho = "\u001B[31m";
        String ciano = "\u001B[36m";

        System.out.println("\n--- LENDO SENSOR: " + localizacao); // Ajustado aqui
        
        if (temperaturaAtual > 100.0) {
            System.out.println("STATUS: " + vermelho + "PERIGO! Superaquecimento: " + temperaturaAtual + "C" + reset);
        } else {
            System.out.println("STATUS: " + ciano + "Operacao Normal: " + temperaturaAtual + "C" + reset);
        }
    }

    public static void main(String[] args) {
        // Criando o primeiro objeto
        SensorTemperatura sensor1 = new SensorTemperatura();
        sensor1.localizacao = "Caldeira Norte";
        sensor1.temperaturaAtual = 125.5;

        // Criando o segundo objeto
        SensorTemperatura sensor2 = new SensorTemperatura();
        sensor2.localizacao = "Resfriador Sul";
        sensor2.temperaturaAtual = 45.0;

        // Criando o terceiro objeto (Sensor da Câmara Fria)
        SensorTemperatura sensor3 = new SensorTemperatura();
        sensor3.localizacao = "Camara Fria";
        sensor3.temperaturaAtual = -15.0; // Temperatura negativa!

        // Chamando a acao
        sensor1.checarStatus();
        sensor2.checarStatus();
        sensor3.checarStatus();
    }
}