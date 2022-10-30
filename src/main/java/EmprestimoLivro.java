import java.time.LocalDate;
import java.util.Date;

public class EmprestimoLivro {
    private int idEmprestimoLivro;
    private int idCliente;
    private int idLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private static int totalEmprestimos = 0;

    public EmprestimoLivro(int idCliente, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        EmprestimoLivro.totalEmprestimos++;
        this.idEmprestimoLivro += totalEmprestimos;
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getIdEmprestimoLivro() {
        return idEmprestimoLivro;
    }

    public void setIdEmprestimoLivro(int idEmprestimoLivro) {
        this.idEmprestimoLivro = idEmprestimoLivro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "\n Empréstimo Livro { " +
                "idEmprestimoLivro: " + idEmprestimoLivro +
                ", idCliente: " + idCliente +
                ", idLivro: " + idLivro +
                ", Data do empréstimo: " + dataEmprestimo +
                ", Data de devolução: " + dataDevolucao +
                '}';
    }
}
