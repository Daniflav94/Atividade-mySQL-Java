public class Cliente {
    private int idCliente;
    private String nomeCompleto;
    private String cpf;
    private int telefone;
    private Endereco endereco;
    private static int totalClientes = 0;

    public Cliente(String nomeCompleto, String cpf, int telefone, Endereco endereco) {
        Cliente.totalClientes++;
        this.idCliente += totalClientes;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n Cliente {" +
                "idCliente: " + idCliente +
                ", Nome Completo:'" + nomeCompleto + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", Telefone: " + telefone +
                ", Endereço: " + endereco +
                '}';
    }
}
