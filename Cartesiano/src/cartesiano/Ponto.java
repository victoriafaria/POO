package cartesiano;

public class Ponto {

    private double x;
    private double y;

    public Ponto() {

    } // construtor padrão

    public Ponto(double vX, double vY) {
        x = vX;
        y = vY;
    } //end construtor parametrizado 

    public Ponto(Ponto T) {
        x = T.x;
        y = T.y;

    }// end construtor copy

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double vX) {
        x = vX;
    }

    public void setY(double vY) {
        y = vY;
    }

    public void Print() {

        System.out.print("(" + x + "," + y + ")");
    }

    public void Scale(double factor) {
        x = x * factor;
        y = y * factor;

    }

    public void Desloc(double dX, double dY) {
        x = x + dX;
        y = y + dY;

    }

    public double Distance (double pX, double pY) {
    
        double dX = pX - x;
        double dY = pY - y;
        
        return Math.sqrt(dX*dX + dY *dY);
    }
    
} //end classe ponto   
