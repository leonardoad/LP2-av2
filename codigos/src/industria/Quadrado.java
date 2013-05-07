package industria;

public class Quadrado extends Figura {

    private double lado;

    public Quadrado(double lado) throws Exception {
        this.setLado(lado);
    }

    public Quadrado(Ponto pt, double lado) throws Exception {
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

    public void setLado(double lado) throws Exception {
        if (lado < 0)
        {
            throw new Exception("Lado não pode ser menor que zero");
        }
        this.lado = lado;
        this.area = Math.pow(this.lado, 2);
        this.perimetro = 4 * this.lado;
    }

    public double getLargura() {
        return this.lado;
        // TODO
    }
}
