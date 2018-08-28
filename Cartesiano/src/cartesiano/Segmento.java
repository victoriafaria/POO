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

    }

} // end classe Segmento
