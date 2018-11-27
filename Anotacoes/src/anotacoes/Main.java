
package anotacoes;


public class Main {

  
    public static void main(String[] args) {
       
        Agenda objAgenda = new Agenda(3);
        objAgenda.add(new Contato("Victoria", "Faria"));
        objAgenda.add(new Contato("João", "Pedro"));
        objAgenda.add(new Contato("Alexandre", "Santos"));
        System.out.println("-----------------Print nome,sobrenome---------------");
        objAgenda.MostrarPrimeiroNome();
        System.out.println("-----------------Print sobrenome,nome---------------");
        objAgenda.MostrarUltimoNome();
        
    }
    
}
