public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstancia();
        logger.log("Iniciando o sistema de logística...");

        Logistica logistica1 = new LogisticaRodoviaria();
        logistica1.planejarEntrega();

        Logistica logistica2 = new LogisticaMaritima();
        logistica2.planejarEntrega();

        logger.log("Entregas concluídas.");
    }
}
