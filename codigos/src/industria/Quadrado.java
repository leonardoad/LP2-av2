package industria;

public class Quadrado extends Figura {

    private double lado;

    public Quadrado(double lado) {
        this.setLado(lado);
    }

    public Quadrado(Ponto pt, double lado) {
        super(pt.getX(), pt.getY());
        this.setLado(lado);

    }

    public double getLado() {
        return lado;
    }

    public String toString() {
        String msg;
        msg = super.toString() + "lado:  " + this.lado;
        return msg;
    }

    public void setLado(double lado) {
        this.lado = lado;
        this.area = Math.pow(this.lado, 2);
        this.perimetro = 4 * this.lado;
    }

    public double getLargura() {
        return this.lado;
        // TODO
    }
}
