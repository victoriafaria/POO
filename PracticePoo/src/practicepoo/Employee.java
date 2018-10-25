
package practicepoo;


public class Employee extends People {

    private final double COXINHA = 42;
    private double salary;
    private int falta;
    
   
    public Employee(String Name, int RG, int Kids) {
        super(Name, RG, Kids);
    }
    
     public Employee(String Name, int RG, int Kids, double salary) {
        super(Name, RG, Kids);
        this.salary =  salary;
    }
    
    @Override
    public double CalcularSalario() {
        double salary;
        salary = (this.salary + 100*Kids + COXINHA) - falta * 0.05;
        return salary;
    }

    @Override
    public void Zerar() {
        this.salary = 0;
    }

    @Override
    public void Hollerit() {
        super.Hollerit(); 
        System.out.println("Salario" + CalcularSalario() + "\n" +
                           "Faltas" + falta);
    }
     
    
    public void RegistrarFalta(){
        falta += 1;
    }
    
    
    
} // end class Employees
