package pkgpoo;

public abstract class Funcionario {

    private String vNome;
    private String vRG;

    public Funcionario(String vNome, String vRG) {

        this.vNome = vNome;
        this.vRG = vRG;

    }

    public String getvNome() {
        return vNome;
    }

    public void setvNome(String vNome) {
        this.vNome = vNome;
    }

    public String getvRG() {
        return vRG;
    }

    public void setvRG(String vRG) {
        this.vRG = vRG;
    }

    public void relatorioMensal() {
        System.out.println("Nome:" + vNome + "\n"
                + "RG:" + vRG);

    }

}
