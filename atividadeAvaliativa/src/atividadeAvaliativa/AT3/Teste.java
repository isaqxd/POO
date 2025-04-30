package atividadeAvaliativa.AT3;

public class Teste {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor();
        f.setNome("Loja Boa");
        f.setEndereco("Algum Lugar do mundo.");
        f.setTelefone("+55 61 90000-0000");
        f.setValorCredito(1000000);
        f.setValorDivida(20000);
        System.out.println(f.toString());

        System.out.println();

        Empregado e = new Empregado();
        e.setNome("Miguel");
        e.setEndereco("Vive em casa.");
        e.setTelefone("+55 71 90000-0000");
        e.setCodigoSetor(5);
        e.setSalarioBase(5000);
        e.setImposto(0.11);
        System.out.println(e.toString());

        System.out.println();

        Administrador a = new Administrador();
        a.setNome("Leticia");
        a.setEndereco("Apartamento Feliz.");
        a.setTelefone("+55 81 90000-0000");
        a.setCodigoSetor(1);
        a.setSalarioBase(5000);
        a.setImposto(0.11);
        a.setAjudaDeCusto(550);
        System.out.println(a.toString());

        System.out.println();

        Operario o = new Operario();
        o.setNome("Ninja");
        o.setEndereco("Night City.");
        o.setTelefone("+01 1 0000-0000");
        o.setCodigoSetor(51);
        o.setSalarioBase(5000);
        o.setImposto(0.11);
        o.setValorProducao(5000);
        o.setComissao(0.08);
        System.out.println(o.toString());

        System.out.println();

        Vendedor v = new Vendedor();
        v.setNome("Vendas");
        v.setEndereco("banco.");
        v.setTelefone("+04 4 0000-0000");
        v.setCodigoSetor(4);
        v.setSalarioBase(5000);
        v.setImposto(0.11);
        v.setValorVendas(5000);
        v.setComissao(0.08);
        System.out.println(v.toString());
    }
}
