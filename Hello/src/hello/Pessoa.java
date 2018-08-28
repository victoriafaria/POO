package hello;

public class Pessoa {

    private String nome, rg;
    private int idade;

    
    public Pessoa(String vNome, String vRg, int vIdade) {
        nome = vNome;
        rg = vRg;
        idade = vIdade;
    }//CONSTRUTOR PARÂMETRIZADO

    public Pessoa (Pessoa p){
     nome = p.nome;
     rg = p.rg;
     idade = p.idade;
    }//COPY CONSTRUCTOR
    
    public void setNome(String vNome) {
        if (!vNome.isEmpty()) {
            nome = vNome;
        }
    }
    
    public void setRg(String vRg) {
        if (!vRg.isEmpty()) {
            rg = vRg;
        }
    }

    public void setIdade(int vIdade) {
        if (vIdade >= 0) {
            idade = vIdade;
        } else {
            System.out.println("Ops! Coloque sua idade corretamente.");
        } 
        
    }

    public String getNome() {
        return nome;
    }
    public String getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    public void print() {
        System.out.println(nome + " " + rg + " " + idade);

    }

}// ClassePessoa
