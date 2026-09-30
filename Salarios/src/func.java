public class func extends dados{

    public func(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }
}
