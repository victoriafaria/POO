package cartesiano;

public class Segmento {

    private Ponto p1, p2;

    public Segmento() {
        p1 = new Ponto(0, 0);
        p2 = new Ponto(1, 0);

    } // end construtor padrão

    public Segmento(double x1, double y1, double x2, double y2) {
        p1 = new Ponto(x1, y1);
        p2 = new Ponto(x2, y2);
    } // end construtor parametrizado 1

    public Segmento(Ponto pt1, Ponto pt2) {
        p1 = new Ponto(pt1);
        p2 = new Ponto(pt2);
    } // end construtor parametrizado 2

    public Segmento(Segmento s) {
        p1 = new Ponto(s.p1);
        p2 = new Ponto(s.p2);
    } // end construtor cópia

    public void Print() {
        System.out.println("[");
        p1.Print();
        System.out.println(",");
        p2.Print();
        System.out.println("]");
    }

    public void Scale(double factor) {

    }

    public Ponto midPoint() {

        double mx = (p1.getX() + p2.getX()) / 2;
        double my = (p1.getY() + p2.getY() / 2);
        return new Ponto(mx, my);
    }

    public double Length() {
        return p1.Distance(p2.getX(), p2.getY());
        //retorna o comprimento do segmento.

    }

    public double Distance(Segmento s) {
        Ponto pms = s.midPoint();
        Ponto pm = midPoint();
        return pm.Distance(pms.getX(), pms.getY());

        //Retorna a distancia entre o ponto medio do segmento interno e o ponto médio
    }

    public void Desloc(double dx, double dy) {
        p1.Desloc(dx, dy);
        p2.Desloc(dx, dy);

    }

    
} // end classe Segmento
