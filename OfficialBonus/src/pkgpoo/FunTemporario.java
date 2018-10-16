
package pkgpoo;

public class FunTemporario extends Funcionario{
    
    private double SalarioMensal;
    private int NotaAvaliacao;

    public FunTemporario(double SalarioMensal, int NotaAvaliacao, String vNome, String vRG) {
        super(vNome, vRG);
        this.SalarioMensal = SalarioMensal;
        this.NotaAvaliacao = NotaAvaliacao;
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
    
    public void Avaliar (int Nota) {
       
        NotaAvaliacao = Nota;
        
    }
    
    @Override
    
    
} // end class FunTemporario
