public class Cliente {
    private int idCliente;
    private String nomeCompleto;
    private String cpf;
    private String telefone;
    private Endereco endereco;
    private static int totalClientes = 0;

    public Cliente(String nomeCompleto, String cpf, String telefone, Endereco endereco) {
        Cliente.totalClientes++;
        this.idCliente += totalClientes;

        if(nomeCompleto.length() < 5) {
            System.out.println("Digite o nome completo");
        } else{
            this.nomeCompleto = nomeCompleto;
        }

        if(cpf.length() != 11) {
            System.out.println("Digite um número de CPF válido com 11 dígitos (Obs: sem acentuação)");
        } else {
            this.cpf = cpf;
        }
        if(telefone.length() < 8){
            System.out.println("Digite um número de telefone válido, com pelo menos 8 dígitos.");
        } else {
            this.telefone = telefone;
        }

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
        if(nomeCompleto.length() < 5) {
            System.out.println("Digite o nome completo");
        } else{
            this.nomeCompleto = nomeCompleto;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (this.cpf.length() != 11) {
            System.out.println("Digite um número de CPF válido com 11 dígitos (Obs: sem acentuação).");
        } else {
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (this.telefone.length() < 9) {
            System.out.println("Digite um número de telefone válido, com pelo menos 8 dígitos.");
        } else {
            this.telefone = telefone;
        }
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
