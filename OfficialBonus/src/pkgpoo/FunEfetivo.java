package pkgpoo;

public class FunEfetivo extends FunProprio {

    private int HoraTrabalhada;
    private int SalarioHora;

    public FunEfetivo(int SalarioHora, String vNome, String vRG) {
        super(vNome, vRG);
        this.HoraTrabalhada = 0;
        this.SalarioHora = SalarioHora;
    }

    public int getHoraTrabalhada() {
        return HoraTrabalhada;
    }

    public void setHoraTrabalhada(int HoraTrabalhada) {
        this.HoraTrabalhada = HoraTrabalhada;
    }

    public int getSalarioHora() {
        return SalarioHora;
    }

    public void setSalarioHora(int SalarioHora) {
        this.SalarioHora = SalarioHora;
    }

    public void AcumularHora(int Hora) {
        HoraTrabalhada += Hora;
    }

    public void zerar() {
        HoraTrabalhada = 0;
    }

    @Override
    public double Bonificar() {
        double SalarioBonificado = SalarioHora * HoraTrabalhada;
        if (HoraTrabalhada > 180) {
            SalarioBonificado += SalarioBonificado * 0.05;
        }
        return SalarioBonificado;
    }

    @Override
    public void relatorioMensal() {
        super.relatorioMensal();
        System.out.println("Horas trabalhadas:" + HoraTrabalhada);
        zerar();

    }

} //end class FunEfetivo extends FunProprio
