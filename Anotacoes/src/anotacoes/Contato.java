
package anotacoes;


public class Contato extends Pessoa implements FormatoNome{

    public Contato() {
    }

    public Contato(String Nome, String sobrenome) {
        super(Nome, sobrenome);
    }

    @Override
    public void setSobrenome(String sobrenome) {
        try {
            
            super.setSobrenome(sobrenome);
        } finally {
            if (sobrenome.isEmpty() || sobrenome.trim().equals("")) {

                throw new UnsupportedOperationException("String Vazia");
            }
        }
    }
    @Override
    public void setNome(String nome) {
        try {
            super.setNome(nome);
        } finally {
            if (nome.isEmpty() || nome.trim().equals("")) {
                throw new UnsupportedOperationException("String Vazia");
            }
        }
    }
    
    @Override
    public String UltimoNome() {
       return getNome() + " " + getSobrenome();
    }

    @Override
    public String UltimoNomeNome() {
         return getSobrenome() + "," + getNome();
    }
    
    
    
    
}
