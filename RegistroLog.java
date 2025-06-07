public class RegistroLog implements Observer {
    private static RegistroLog instancia;

    private RegistroLog() {}

    public static RegistroLog getInstancia() {
        if (instancia == null) {
            instancia = new RegistroLog();
        }
        return instancia;
    }

    public void log(String mensagem) {
        System.out.println("LOG: " + mensagem);
    }

    @Override
    public void atualizar(String mensagem) {
        log("Notificação recebida: " + mensagem);
    }
}
