public class presidente extends dados {

    public presidente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}
