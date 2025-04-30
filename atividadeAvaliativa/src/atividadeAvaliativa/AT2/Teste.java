package atividadeAvaliativa.AT2;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Objeto Gerente");
        Gerente g = new Gerente();
        g.setNome("Verissimo");
        g.setIdade(60);
        g.setMatricula("0001");
        g.setNomeGerencia("Ordem");
        g.setSalario(20000.00);
        System.out.println(g.toString());

        System.out.printf("\n");

        System.out.println("Objeto Vendedor");
        Vendedor v = new Vendedor();
        v.setNome("Harvey Specter");
        v.setSalario(15000);
        v.setValorVendas(40000);
        v.setQtdVendas(20);
        System.out.println(v.toString());

        System.out.printf("\n");

        System.out.println("Objeto Cliente");
        Cliente c = new Cliente();
        c.setNome("Peter Park");
        c.setIdade(22);
        c.setValorDivida(30000);
        c.setAnoNascim(2001);
        System.out.println(c.toString());
    }
}
