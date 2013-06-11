package examen1;
/**
 * La clase Punto permite representar puntos del plano mediante sus coordenadas cartesianas  
 *
 */
public class Punto {
	private double x, y;
	
	/** 
	 * Constructor por omisión para inicializar 
	 * a cero ambas coordenadas
	 */
	public Punto() {
		x=0;
		y=0;
	}
	
	/** 
	 * Constructor para inicializar ambas coordenadas
	 * con los valores pasados por parámetro
	 */
	public Punto(double a, double b) {
		x=a;
		y=b;
	}
	
	/**
	 * Devuelve el valor de la coordenada x del punto actual
	 * @return el valor de la coordenada x
	 */
	public double abscisa(){
		return x;
	}

	/**
	 * Devuelve el valor de la coordenada y del punto actual
	 * @return el valor de la coordenada y
	 */
	public double ordenada(){
		return y;
	}

	/**
	 * Comprueba si dos objetos de la clase Punto son iguales o no, compara el punto 
	 * actual con el pasado por parámetro
	 * @param p es un objeto de la clase Punto 
	 * @return verdadero si los dos objetos de la clase Punto son el mismo o son iguales
	 * y falso en caso contrario
	 */
	public boolean equals(Object p) {
		Punto otro= (Punto) p;
		if((this==otro) || ((x==otro.x) && (y==otro.y)))
			return true;
		else
			return false;
	}

	/**
	 * Devuelve una String que corresponde a una representación textual del objeto 
	 * @return una String que representa al objeto
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	
}
