import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca bibliotecaDaDani = new Biblioteca();
        System.out.println("\n \u001b[30m \u001b[104m                    BIBLIOTECA DA DANI  \uD83D\uDCDA                  \u001b[m \n");

        Cliente cliente1 = new Cliente("Daniele Almeida", "424.684.828-00", 945567800, new Endereco("Rua Augusto Calheiro", "000A", "09380-000", "Mauá", "SP"));
        Cliente cliente2 = new Cliente("Bob Almeida", "444.555.666-00", 943490606, new Endereco("Rua Francisco Alves", "123", "09380-360", "Mauá", "SP"));
        Cliente cliente3 = new Cliente("Felipe Almeida", "555.555.666-00", 993490606, new Endereco("Rua Francisco Alves", "123", "09380-360", "Mauá", "SP"));

        Livro livro1 = new Livro("Orgulho e Preconceito", "Jane Austen", 2);
        Livro livro2 = new Livro("Frankstein", "Mary Shelley", 3);
        Livro livro3 = new Livro("A Seleção", "Kiera Cass", 1);
        Livro livro4 = new Livro("Crepúsculo", "Stephanie Meyer", 2);


        bibliotecaDaDani.cadastrarCliente(cliente1);
        bibliotecaDaDani.cadastrarCliente(cliente2);
        bibliotecaDaDani.cadastrarCliente(cliente2);

        bibliotecaDaDani.cadastrarLivro(livro1);
        bibliotecaDaDani.cadastrarLivro(livro2);
        bibliotecaDaDani.cadastrarLivro(livro3);
        bibliotecaDaDani.cadastrarLivro(livro4);
        bibliotecaDaDani.cadastrarLivro(livro4);

        bibliotecaDaDani.alugarLivro(cliente1, livro1, LocalDate.of(2022,10,2));
        bibliotecaDaDani.alugarLivro(cliente1, livro3, LocalDate.of(2022,10,15));
        bibliotecaDaDani.alugarLivro(cliente2, livro2, LocalDate.of(2022,10,25));
        bibliotecaDaDani.alugarLivro(cliente2, livro1, LocalDate.of(2022,10,28));
        bibliotecaDaDani.alugarLivro(cliente3, livro4, LocalDate.now());

        bibliotecaDaDani.devolverLivro(livro1);
        bibliotecaDaDani.devolverLivro(livro3);
        bibliotecaDaDani.devolverLivro(livro4);


        System.out.println("\n \u001b[38;2;255;255;255m \u001b[48;2;42;122;228m                          REGISTROS   \uD83D\uDCCB                       \u001b[m \n");
        System.out.println("\u001b[1m \u001b[3m Lista de clientes cadastrados: \u001b[m");
        System.out.println(bibliotecaDaDani.getListaClientes());
        System.out.println("---------------------------------------------------------------------------------------------------------");

        System.out.println("\u001b[1m \u001b[3m Registros de todos os empréstimos já realizados pela biblioteca: \u001b[m");
        System.out.println(bibliotecaDaDani.getListagemEmprestimos());
        System.out.println("---------------------------------------------------------------------------------------------------------");

        System.out.println("\u001b[1m \u001b[3m Lista de livros alugados: \u001b[m");
        System.out.println(bibliotecaDaDani.getLivrosAlugados());
        System.out.println("---------------------------------------------------------------------------------------------------------");

        System.out.println("\u001b[1m \u001b[3m Lista de livros disponíveis: \u001b[m");
        System.out.println(bibliotecaDaDani.getListaLivros());
        System.out.println("---------------------------------------------------------------------------------------------------------");

    }
}
