public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private int qntExemplares;
    private static int totalLivros = 0;

    public Livro(String titulo, String autor, int qntExemplares) {
        Livro.totalLivros++;
        this.idLivro += totalLivros;
        this.titulo = titulo;
        this.autor = autor;
        this.qntExemplares = qntExemplares;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQntExemplares() {
        return qntExemplares;
    }

    public void setQntExemplares(int qntExemplares) {
        this.qntExemplares = qntExemplares;
    }

    @Override
    public String toString() {
        return "\n Livro {" +
                "idLivro: " + idLivro +
                ", Título: '" + titulo + '\'' +
                ", Autor(a): '" + autor + '\'' +
                ", Quantidade de Exemplares: " + qntExemplares +
                '}';
    }
}
