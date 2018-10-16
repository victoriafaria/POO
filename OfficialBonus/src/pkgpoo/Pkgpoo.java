/*
 VICTORIA ANDRESSA SANTOS MACEDO DE FARIA 0040481711011
 */
package pkgpoo;


public class Pkgpoo {

    
    public static void main(String[] args) {
     
        FunEfetivo objFunEfetivo = new FunEfetivo(50, "Carol", "34.984.836.4");
        FunTemporario objFunTemporario = new FunTemporario ( 1500.00, 0, "Victoria", "65.923.937.3");
        FunTercerizado objFuunTercerizado = new FunTercerizado (0, "IBM", "Maria", "34.987.378.0");
        
        System.out.println(" ------------------- PRIMEIRO MÊS ------------------- ");
        objFunEfetivo.AcumularHora(180);
        objFunTemporario.Avaliar(3);
        objFuunTercerizado.AcumularHora(180);
        
        System.out.println("FUNCIONARIO EFETIVO");
        objFunEfetivo.relatorioMensal();
        
        System.out.println("FUNCIONARIO TEMPORÁRIO");
        objFunTemporario.relatorioMensal();
        
        System.out.println("FUNCIONARIO TERCERIZADO");
        objFuunTercerizado.relatorioMensal();
        
        //------------------------- FIM PRIMEIRO MÊS ----------------------------------
        
        System.out.println("------------------- SEGUNDO MÊS ------------------- ");
        objFunEfetivo.AcumularHora(200);
        objFunTemporario.Avaliar(5);
        objFuunTercerizado.AcumularHora(120);
        
        System.out.println("FUNCIONARIO EFETIVO");
        objFunEfetivo.relatorioMensal();
        
        System.out.println("FUNCIONARIO TEMPORÁRIO");
        objFunTemporario.relatorioMensal();
        
        System.out.println("FUNCIONARIO TERCERIZADO");
        objFuunTercerizado.relatorioMensal();
        
        
}
}
