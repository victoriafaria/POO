
package anotacoes;


public class Pessoa {
    
    private String Nome, sobrenome;

    public Pessoa () {
    }
    
    public Pessoa(String Nome, String sobrenome) {
        this.Nome = Nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
      
    
    
}
