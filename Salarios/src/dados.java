public abstract class dados {
    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double calcularBonus();

    public dados(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


}