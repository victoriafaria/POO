
package pkgpoo;


public class FunTercerizado extends Funcionario {
      
    public FunTercerizado(String vNome, String vRG) {
        super(vNome, vRG);
    }
   
     protected int iHoraTrabalhada;
     protected String sEmpresaOrigem;
     
     
    public void AcumularHora (int iHora) {
        iHora += iHoraTrabalhada;    
    } // end AcumularHora
    
    public void Zerar () {
    
        iHoraTrabalhada = 0;
    }
    
    @Override
    public void relatorioMensal() {
        super.relatorioMensal(); 
        System.out.println("Nome da empresa: " + sEmpresaOrigem + "\n"
                + "Horas trabalhadas: " + iHoraTrabalhada);
        Zerar();
    }

    public FunTercerizado(int iHoraTrabalhada, String sEmpresaOrigem, String vNome, String vRG) {
        super(vNome, vRG);
        this.iHoraTrabalhada = iHoraTrabalhada;
        this.sEmpresaOrigem = sEmpresaOrigem;
    }
    
    
      
} //end FunTercerizado
