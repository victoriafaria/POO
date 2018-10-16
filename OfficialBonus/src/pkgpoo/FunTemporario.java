package pkgpoo;

public class FunTemporario extends FunProprio {

    private double SalarioMensal;
    private int NotaAvaliacao;

    public FunTemporario(double SalarioBase, int NotaAvaliacao, String vNome, String vRG) {
        super(vNome, vRG);
        this.SalarioMensal = SalarioBase;
        this.NotaAvaliacao = 0;
    }

    public double getSalarioMensal() {
        return SalarioMensal;
    }

    public void setSalarioMensal(double SalarioMensal) {
        this.SalarioMensal = SalarioMensal;
    }

    public int getNotaAvaliacao() {
        return NotaAvaliacao;
    }

    public void setNotaAvaliacao(int NotaAvaliacao) {
        this.NotaAvaliacao = NotaAvaliacao;
    }

    public void Zerar() {
        NotaAvaliacao = 0;
    }

    public void Avaliar(int Nota) {
        NotaAvaliacao = Nota;
    }

    @Override
    public void relatorioMensal() {
        super.relatorioMensal();
        System.out.println("Nota na avaliação mensal: " + NotaAvaliacao);
        Zerar();

    }

    @Override
    public double Bonificar() {
        double SalarioBonificado = SalarioMensal;
        if (NotaAvaliacao == 5) {
            SalarioBonificado += SalarioBonificado * 0.05;
        }
        return SalarioBonificado;
    }

} // end class FunTemporario
