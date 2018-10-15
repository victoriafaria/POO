
package pkgpoo;


public class FunTercerizado extends Funcionario {
       
 
    public FunTercerizado(String vNome, String vRG) {
        super(vNome, vRG);
    }
   
     int iHoraTrabalhada;
    
    public void AcumularHora (int iHora) {
        iHora += iHoraTrabalhada;    
    } // end AcumularHora
    
    
    
}
