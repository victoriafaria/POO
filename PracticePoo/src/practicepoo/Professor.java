package practicepoo;

public class Professor extends People {

    protected String Course;
    protected double ClassHour;
    protected int QttClass;

    public Professor(String Name, int RG, int Kids) {
        super(Name, RG, Kids);
    }

    public Professor(String Name, int RG, int Kids, String Course, int ClassHour) {
        super(Name, RG, Kids);
        this.Course = Course;
        this.ClassHour = ClassHour;
    }

  

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    @Override
    public double CalcularSalario() {
        double SalarioMensal;
        SalarioMensal = QttClass * ClassHour + 100*Kids;
        return SalarioMensal;
    }

    @Override
    public void Zerar() {
        QttClass = 0;
    }

    @Override
    public void Hollerit() {
          super.Hollerit(); 
         System.out.println("ClassHour: " + ClassHour + "\n"
                            + "QttClass: " + QttClass + "\n"
                            + "Salario: " + CalcularSalario());
    }
   
    
    public void RegistrarAula(int qtd) {
        QttClass = qtd;
    }
    
    

} //end class Professor
