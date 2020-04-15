package app;

public class Gerente extends Funcionario {
    private int senhaEspecial;
    private int numFuncionariosGerenciados;

    public Gerente(int senhaEspecial) {
        this.senhaEspecial = senhaEspecial;
    }

    public int getSenhaEspecial() {
        return senhaEspecial;
    }

    public void setSenhaEspecial(int senhaEspecial) {
        this.senhaEspecial = senhaEspecial;
    }

    public int getNumFuncionariosGerenciados() {
        return numFuncionariosGerenciados;
    }

    public void setNumFuncionariosGerenciados(int numFuncionariosGerenciados) {
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
    }

    public void getBonification(Double percent) {        
        System.out.println("Gratificacao: R$ "+ this.getSalario() * percent + 1000);
    }       

    public void AutenticaSenha(int senha) {
        if( senha == this.senhaEspecial) {
           System.out.println("Acesso Liberado!");
        } else {
            System.out.println("Acesso Negado!");
        }
    }

    public void listarGerente() {
        System.out.println(
        "Nome: "+getNome()+
        "\nCPF: "+getCpf()+
        "\nSalario: R$ "+getSalario()+
        "\nFuncionarios Gerenciados: "+getNumFuncionariosGerenciados()
        );
    }   
}