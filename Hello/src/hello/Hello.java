package hello;

public class Hello {

    public static void main(String[] args) {

       // String st = "Hello World";
       // System.out.println(st.toUpperCase());

        Pessoa ps, ps2;
        ps = new Pessoa("João", "123-4", -20);
        ps.print();
        
        
        ps2 = new Pessoa(ps);        
        ps2 = ps;
        ps2.setNome("José");
        ps2.print();
        
    }

} // Classe Hello 
