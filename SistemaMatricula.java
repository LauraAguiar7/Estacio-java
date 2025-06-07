import java.util.ArrayList;
import java.util.List;

public abstract class SistemaMatricula implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public abstract Curso criarCurso();

    public void realizarMatricula() {
        Curso curso = criarCurso();
        curso.exibirInformacoes();
        notificarObservers("Matrícula realizada para: " + curso.getClass().getSimpleName());
    }

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(String mensagem) {
        for (Observer obs : observers) {
            obs.atualizar(mensagem);
        }
    }
}
