package pkgpoo;

public abstract class FunProprio extends Funcionario {

    public FunProprio(String vNome, String vRG) {
        super(vNome, vRG);
    }

    @Override
    public void relatorioMensal() {
        super.relatorioMensal();
        System.out.println("Salário à receber" + Bonificar());

    }

    public abstract double Bonificar();

} // ed class FunProprio extends Funcionario
