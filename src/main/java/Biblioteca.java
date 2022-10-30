import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    ArrayList<Livro> listaLivros = new ArrayList<Livro>();
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<Livro> livrosAlugados = new ArrayList<Livro>();

    ArrayList<EmprestimoLivro> listagemEmprestimos = new ArrayList<EmprestimoLivro>();

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Livro> getLivrosAlugados() {
        return livrosAlugados;
    }

    public ArrayList<EmprestimoLivro> getListagemEmprestimos() {
        return listagemEmprestimos;
    }

    public void alugarLivro(Cliente cliente, Livro livro, LocalDate data){
        if (listaClientes.contains(cliente)){
            if (listaLivros.contains(livro)){
                listaLivros.remove(livro);
                LocalDate dataDevolucao = LocalDate.ofYearDay(data.getYear(),data.getDayOfYear() + 15);
                LocalDate dataAtual = LocalDate.now();
                EmprestimoLivro emprestimoLivro = new EmprestimoLivro(cliente.getIdCliente(), livro.getIdLivro(), data, dataDevolucao);
                listagemEmprestimos.add(emprestimoLivro);
                livrosAlugados.add(livro);
                System.out.println("\n\u001b[1m ID Empréstimo: " + emprestimoLivro.getIdEmprestimoLivro() + ", ID Cliente: " + cliente.getIdCliente() + ", ID Livro: " + livro.getIdLivro() + "\u001b[m");
                System.out.println("OBA! Livro " + livro.getTitulo() + " foi alugado pelo(a) cliente " + cliente.getNomeCompleto());
                System.out.println("\n----------------------------------------------------------------------------");

            }else {
                System.out.println("\u274C\u001b[31m  [ERRO ao alugar]\u001b[m Livro " + livro.getTitulo() + " indisponível no acervo");
            }
        }else {
            System.out.println("\u274C\u001b[31m  [ERRO ao alugar]\u001b[m Cliente " + cliente.getNomeCompleto() + " não cadastrado, faça o cadastro para prosseguir!");
        }
    }

    public void devolverLivro(Livro livro){
        if (livrosAlugados.contains(livro)) {
            livrosAlugados.remove(livro);
            listaLivros.add(livro);
            System.out.println("\u2714\uFE0FLivro " + livro.getTitulo() + " devolvido!");
        }else {
            System.out.println("\u274C\u001b[31m  [ERRO devolução]\u001b[m O livro " + livro.getTitulo() + " não consta como alugado. Verifique o nome do livro e tente novamente.");
        }
    }

    public void cadastrarCliente(Cliente cliente){
        if (listaClientes.contains(cliente)){
            System.out.println("\u274C\u001b[31m  [ERRO cadastro cliente]\u001b[m Cliente " + cliente.getNomeCompleto() + " já possui cadastro!");
        }else {
            listaClientes.add(cliente);
            System.out.println("\u2714\uFE0FCliente " + cliente.getNomeCompleto() + " cadastrado com sucesso!");
        }
    }

    public void cadastrarLivro(Livro livro){
        if (listaLivros.contains(livro)){
            System.out.println("\u274C\u001b[31m  [ERRO cadastro livro]\u001b[m Livro " + livro.getTitulo() + " já consta no acervo!");
        }else {
           listaLivros.add(livro);
            System.out.println("\u2714\uFE0FLivro " + livro.getTitulo() + " cadastrado com sucesso!");
        }
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLivros=" + listaLivros +
                ", listaClientes=" + listaClientes +
                ", livrosAlugados=" + livrosAlugados +
                ", listagemEmprestimos=" + listagemEmprestimos +
                '}';
    }
}
