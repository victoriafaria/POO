
package anotacoes;


public class Agenda {
    
   FormatoNome List[];
   int v;
   
   public Agenda(int max){
       List = new FormatoNome[max];
       v = 0; 
   }
   
    public void add (FormatoNome nfi){
           try {
            if (v < List.length) {
                List[v] = nfi;

            }
        } finally {
            if (List.length <= v) {
                throw new UnsupportedOperationException("Capacidade máxima ultrapassada");
            }
        }
        v++;     }
    public void MostrarPrimeiroNome() {
        for (int i = 0; i < v; i++) {
            System.out.println(List[i].UltimoNome());
        }
    }
    public void MostrarUltimoNome() {
        for (int i = 0; i < v; i++) {
            System.out.println(List[i].UltimoNomeNome());
        }
    
    }
}
