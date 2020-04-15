package app;

public class Funcionario {
    private String nome;
    private String cpf;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    // funcao de bonificao
    public void getBonification(Double percent) {        
        System.out.println("Gratificacao: R$ "+ this.salario * percent); //
    }    

    public void listarFuncionario() {
        System.out.println(
        "Nome: "+getNome()+
        "\nCPF: "+getCpf()+
        "\nSalario: R$ "+getSalario());
    }
}