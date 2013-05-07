package industria;

import java.text.DecimalFormat;
import java.text.Format;

public class Retangulo extends Figura {

    private double altura;
    private double largura;
    private double retalho;

    public Retangulo(double a, double l) throws Exception {
        this.setRetangulo(a, l);
        this.setRetalho(a * l);
    }

    public String toString() {
        String msg;
        msg = super.toString() + "m²:  " + this.altura * this.largura;
        return msg;
    }

    public void setRetangulo(double a, double l) throws Exception {

        if (a < 0.0 && l < 0.0) {
            throw new Exception("Retangulo deve ser maior que zero");
        }
        this.altura = a;
        this.largura = l;


    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public boolean testaLocal(Figura fig[], int cont) {
        for (int i = 0; i < cont; i++) 
        {
            if(!fig[i].testaLocal(fig[cont].p)){
                //System.out.println("Entrei teste 1");
                return false;
            }
                    
            
            
            double t2 = fig[cont].p.getX() + fig[cont].getLargura();
            Ponto pt1 = new Ponto(t2,fig[cont].getY());
            if(!fig[i].testaLocal(pt1))
            {
                //System.out.println("Entrei teste 2");
                return false;
            }
            
            
            t2 = fig[cont].p.getX() + fig[cont].getLargura();
            double t3 = fig[cont].p.getY() + fig[cont].getLargura();
            pt1 = new Ponto(t2,t3);
            if(!fig[i].testaLocal(pt1))
            {
                //System.out.println("Entrei teste 3");
                return false;
            }
           
            
            t2 = fig[cont].p.getY() + fig[cont].getLargura();
            pt1 = new Ponto(fig[cont].getX(),t2);           
            if(!fig[i].testaLocal(pt1))
            {
                //System.out.println("Entrei teste 4");
                return false;
            }
        }

        return true;
    }

    public boolean testaFolha(Figura fig[], int cont) {
        double altura = 0;
        double lado = 0;
        int vet;
        altura = this.getAltura();
        lado = this.getLargura();

        if (fig[cont].getLargura() >= this.getLargura() || fig[cont].getLargura() >= this.getAltura()) 
        {
            System.out.println("Figura muito Grande");
            return false;
        } else {
            /*
             * Testa se a posição que foi inserido a figura cabe no papel
             */
            if (fig[cont].getX() + fig[cont].getLargura() >= this.getLargura() || fig[cont].getY() + fig[cont].getLargura() >= this.getAltura()) {
                System.out.println("F1: "+(fig[cont].getX() + fig[cont].getLargura())+"+ "+(fig[cont].getY() + fig[cont].getLargura()));
                System.out.println("Figura não cabe no Papel ou sai pra fora");
                return false;
            } else {
                if (this.testaLocal(fig, cont)) {
                    DecimalFormat df = new DecimalFormat("#,###.00");
                    this.retalho = this.retalho - fig[cont].getArea();
                    System.out.println("Retalhos Restantes: " + df.format(this.retalho) + " m²");
                    double percent = (double) (fig[cont].getArea() * 100.0) / (this.altura * this.largura);
                    System.out.println("O " + fig[cont].getClass() + " ocupa " + df.format(percent) + "%");
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

    private void setRetalho(double d) {
        this.retalho = d;
    }
}
