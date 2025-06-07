public class MatriculaPresencial extends SistemaMatricula {
    @Override
    public Curso criarCurso() {
        return new CursoPresencial();
    }
}
