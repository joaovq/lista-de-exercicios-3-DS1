package Q8;

public abstract class Cliente {
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String imprimirDados() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
class PessoaJuridica extends Cliente{
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String imprimirDados() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                '}';
    }
}