package pkgpoo;

public class FunTercerizado extends Funcionario {

    protected int HoraTrabalhada;
    protected String EmpresaOrigem;

    public FunTercerizado(int HoraTrabalhada, String EmpresaOrigem, String vNome, String vRG) {
        super(vNome, vRG);
        this.HoraTrabalhada = HoraTrabalhada;
        this.EmpresaOrigem = EmpresaOrigem;
    }

    public void AcumularHora(int Hora) {
        Hora += HoraTrabalhada;
    } // end AcumularHora

    public void Zerar() {
        HoraTrabalhada = 0;
    }

    @Override
    public void relatorioMensal() {
        super.relatorioMensal();
        System.out.println("Nome da empresa: " + EmpresaOrigem + "\n"
                + "Horas trabalhadas: " + HoraTrabalhada);
        Zerar();
    }

} //end FunTercerizado Extends Funcionario
