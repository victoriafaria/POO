
package practicepoo;


public class PracticePoo {

    
    public static void main(String[] args) {
       
        Professor objProfessor = new Professor("José", 34345345, 2, "Logistica", 25);
        Employee objEmployee =  new Employee("Leticia", 94345987, 1, 1200.00);
        
        System.out.println("-------- PRIMEIRO MÊS --------");
        objProfessor.RegistrarAula(15);
        objProfessor.Hollerit();
        objProfessor.Zerar();
        
        objEmployee.RegistrarFalta();
        objEmployee.Hollerit();
        objEmployee.Zerar();
        
        System.out.println("-------- SEGUNDO MÊS --------");
        objProfessor.RegistrarAula(28);
        objProfessor.Hollerit();
        objProfessor.Zerar();
        
        objEmployee.RegistrarFalta();
        objEmployee.Hollerit();
        objEmployee.Zerar();
        
    }
    
}
