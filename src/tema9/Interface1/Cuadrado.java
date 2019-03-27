package tema9.Interface1;

/*
 * Crea una clase Cuadrado que implemente la interfaz, 
 * donde getNumLados devuelva 4 y getLongitudLados 
 * retorne una variable que será establecida en el constructor.
 */

public class Cuadrado implements PoligonoRegular{
	
	public Cuadrado(int longiLados) {
		super();
		getLongitudLados(longiLados);
	}

	@Override
	public int getNumLados() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public float getLongitudLados(float longiLados) {
		// TODO Auto-generated method stub
		return longiLados;
	}

	public float getPerimeter(float longiLados) {
		return getNumLados()*getLongitudLados(longiLados);
	}
	
	public float getInteriorAngle(float longiLados) {
		return ((longiLados-2)*PI/longiLados);
	}

}
