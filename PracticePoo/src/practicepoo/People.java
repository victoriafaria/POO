
package practicepoo;



public abstract class People {
    
    protected String Name;
    protected int RG;
    protected int Kids;

    public People(String Name, int RG, int Kids) {
        this.Name = Name;
        this.RG = RG;
        this.Kids = Kids;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getKids() {
        return Kids;
    }

    public void setKids(int Kids) {
        this.Kids = Kids;
    }

    
    public abstract double CalcularSalario ();
    
    public abstract void Zerar();
    
    public void Hollerit(){
        
        System.out.println("Name: " + Name + "\n" +
                            "RG: " + RG + "\n" +
                            "Kids: " + Kids);
    
    }
    
    
 } // end class people
