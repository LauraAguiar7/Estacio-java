public class MatriculaOnline extends SistemaMatricula {
    @Override
    public Curso criarCurso() {
        return new CursoOnline();
    }
}
