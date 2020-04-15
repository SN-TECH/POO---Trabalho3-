package app;

public class Tester {
    public static void main(String[] args) throws Exception {
        System.out.println("*************************************************");
        System.out.println("\nNome: Michaeel Nascimento --- Matrícula: 15719");
        System.out.println("\n***********************************************");

        Funcionario f1 = new Funcionario();
        f1.setNome("Michael");
        f1.setCpf("1111111111111");
        f1.setSalario(1000.00);                
        f1.getBonification(0.1); 

        System.out.println("\n");
        
        Gerente g1 = new Gerente(12345);
        g1.setNome("Fabio");
        g1.setCpf("151512131415");
        g1.setSalario(5000.00);
        g1.setNumFuncionariosGerenciados(3);        
        g1.AutenticaSenha(12346);
        g1.getBonification(0.1);
    }
}