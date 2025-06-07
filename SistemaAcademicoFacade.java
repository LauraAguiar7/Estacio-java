public class SistemaAcademicoFacade {
    private SistemaMatricula presencial;
    private SistemaMatricula online;
    private RegistroLog logger;

    public SistemaAcademicoFacade() {
        this.presencial = new MatriculaPresencial();
        this.online = new MatriculaOnline();
        this.logger = RegistroLog.getInstancia();

        // Adiciona o log como observer
        presencial.adicionarObserver(logger);
        online.adicionarObserver(logger);
    }

    public void processarMatriculas() {
        logger.log("Iniciando matrículas no sistema acadêmico...");

        presencial.realizarMatricula();
        online.realizarMatricula();

        logger.log("Matrículas concluídas com sucesso.");
    }
}
