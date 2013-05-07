/*
 * Copyright (c) 2013, SENACRS/FSPOA. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
package industria;

/**
 * A classe <code>Figura</code> � a classe base para
 * implementar as demais formas geometricas
 *
 * <p><blockquote><pre>
 *    Figura fig = new Circulo(3.4);
 * </pre></blockquote><p>
 *
 * @author kaduh.ricardo@gmail.com
 * @see lp2.generalizacao.Circulo
 * @see lp2.generalizacao.Quadrado
 *
 */

public abstract class Figura {

	protected Ponto p;

	protected double area;
	protected double perimetro;

	public Figura() {
		this(0.0, 0.0);
	}

	public Figura(double x, double y) {
		super();
		this.p = new Ponto(x, y);
		this.area = 0.0;
		this.perimetro = 0.0;
	}

	public Figura(Ponto centro) {
		super();
		this.p = new Ponto(centro.getX(), centro.getY());
		this.area = 0.0;
		this.perimetro = 0.0;
	}

	/* (non-Javadoc)
	 * @see lp2.generalizacao.IntFigura#getArea()
	 */
	public double getArea() {
		return this.area;
	}

	/* (non-Javadoc)
	 * @see lp2.generalizacao.IntFigura#getPerimetro()
	 */
	public double getPerimetro() {
		return this.perimetro;
	}
	@Override
	public String toString() {
		String msg;
		msg = super.toString()+" area:  "+ this.area + " perimetro: "+ this.perimetro+ " Pos.X: "+this.p.getX()+" Pos.Y: "+this.p.getY();
		return msg;
	}

	public double getX() {
		return p.getX();
	}

	public void setX(double x) {
		p.setX(x);
	}

	public double getY() {
		return p.getY();
	}

	public void setY(double y) {
		p.getY();
	}
        
        abstract double getLargura();
       


}
