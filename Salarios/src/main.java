public class main {
    static void main() {
        presidente p = new presidente("Carlos",
                "145.456.789-67",
                100000.00);

        func f = new func("João",
                "890.776.442-00",
                1000.00);

        System.out.println("PRESIDENTE:");
        System.out.println("Nome -> " + p.nome);
        System.out.println("CPF -> " + p.cpf);
        System.out.println("Salario -> " + p.salario);
        System.out.println("Salario final -> " + (p.calcularBonus() + p.salario));
        System.out.println("\nBonus -> " + p.calcularBonus());

        System.out.println("\n===========================================");

        System.out.println("\nFUNCIONARIO:");
        System.out.println("Nome -> " + f.nome);
        System.out.println("CPF -> " + f.cpf);
        System.out.println("Salario -> " + f.salario);
        System.out.println("Salario final -> " + (p.calcularBonus() + f.salario));
        System.out.println("\nBonus -> " + f.calcularBonus());
    }
}

