package industria;

import java.text.DecimalFormat;
import java.text.Format;

public class Retangulo extends Figura {

    private double altura;
    private double largura;
    private double retalho;

    public Retangulo(double a, double l) {
        this.setRetangulo(a, l);
        this.setRetalho(a*l);
    }

    public String toString() {
        String msg;
        msg = super.toString() + "m²:  " + this.altura * this.largura;
        return msg;
    }

    public void setRetangulo(double a, double l) {
       
            if (a > 0.0 && l > 0.0) {
                this.altura = a;
                this.largura = l;
            }
        

    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public boolean testaFolha(Figura fig[], int cont) {
        double altura = 0;
        double lado = 0;
        int vet;
        altura = this.getAltura();
        lado = this.getLargura();

        if (fig[cont].getLargura() >= this.getLargura() || fig[cont].getLargura() >= this.getAltura()) {
            return false;
        } else 
        {
            DecimalFormat df = new DecimalFormat("#,###.00"); 
            this.retalho = this.retalho - fig[cont].getArea();
            System.out.println("Retalhos Restantes: "+df.format(this.retalho)+" m²");
            double percent = (double)(fig[cont].getArea() * 100.0 ) / (this.altura * this.largura);
            System.out.println("O "+fig[cont].getClass()+" ocupa "+df.format(percent)+ "%");
            return true;
            
        }


    }

    private void setRetalho(double d) {
        this.retalho = d;
    }
    
    
}
