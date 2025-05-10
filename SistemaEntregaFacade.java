public class SistemaEntregaFacade {
    private Logistica logisticaRodoviaria;
    private Logistica logisticaMaritima;
    private Logger logger;

    public SistemaEntregaFacade() {
        this.logisticaRodoviaria = new LogisticaRodoviaria();
        this.logisticaMaritima = new LogisticaMaritima();
        this.logger = Logger.getInstancia();
    }

    public void realizarEntregas() {
        logger.log("Iniciando entregas pela fachada...");

        logisticaRodoviaria.planejarEntrega();
        logisticaMaritima.planejarEntrega();

        logger.log("Todas as entregas foram realizadas com sucesso.");
    }
}
