package industria;

/**
 * A classe Circulo implementa a forma geom�trica do c�rculo
 *
 * <p>
 * <blockquote>
 *
 * <pre>
 * Figura fig = new Circulo(3.4);
 * Circulo fig = new Circulo(2);
 * </pre>
 *
 * </blockquote>
 * <p>
 *
 * @author leonardo.danieli@gmail.com
 * @author marco.mangan@gmail.com
 */
public class Circulo extends Figura {

	private double raio;
	protected double area;
	protected double perimetro;

	/**
	 * Cria um c�rculo com raio de valor 1.0.
	 *
	 * @see #Circulo(double)
	 * @see #Circulo(Circulo)
	 */
	public Circulo() {
		this(1.0); // ativa o construtor #Circulo(double)
	}

	/**
	 * Cria um c�rculo com raio de valor <code>raio</code>.
	 *
	 * <p>
	 * <blockquote>
	 *
	 * <pre>
	 * Figura fig = new Circulo(3.4);
	 * fig.setX(2.0);
	 * fig.setY(2.0);
	 * </pre>
	 *
	 * </blockquote>
	 * <p>
	 *
	 * @param raio
	 *            o valor do raio, deve ser um valor maior do que zero.
	 * @see #Circulo()
	 * @see #Circulo(Circulo)
	 * @throws RuntimeException
	 *             Caso o valor do raio seja igual ou inferior a zero.
	 */
	public Circulo(double raio) {
		super();
		if (raio <= 0.0)
			throw new RuntimeException(
					"O valor do raio deve ser um n�mero maior do que zero.");
		this.setRaio(raio);
	}

	/**
	 *
	 * @param centro
	 * @param raio
	 */
	public Circulo(Ponto centro, double raio) {
		super(centro);
		if (raio <= 0.0)
			throw new RuntimeException(
					"O valor do raio deve ser um n�mero maior do que zero.");
		this.setRaio(raio);
	}

	/**
	 * Cria um c�rculo com raio equivalente ao raio de outro c�rculo existente.
	 *
	 * @param outroCirculo
	 * @see #Circulo()
	 * @see #Circulo(double)
	 */
	public Circulo(Circulo outroCirculo) {
		this(outroCirculo.raio); // ativa o construtor #Circulo(double)
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
		this.area = Math.PI * Math.pow(this.raio, 2);
		this.perimetro = 2 * Math.PI;
	}

	@Override
	public String toString() {
		String msg;
		msg = super.toString() + " raio:  " + this.raio;
		return msg;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see lp2.generalizacao.IntFigura#getArea()
	 */
	public double getArea() {
		return this.area;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see lp2.generalizacao.IntFigura#getPerimetro()
	 */
	public double getPerimetro() {
		return this.perimetro;
	}

    @Override
    double getLargura() 
    {
        return this.raio * 2;
    }
        
        

}
