package tema9.Interface1;

/*
 * Crea una interfaz llamada PoligonoRegular 
 * que tenga dos métodos abstractos: getNumLados y getLongitudLados.
 * Añada dos métodos default a la interfaz:
	+ getPerimeter(): devuelve n* longitud, donde n es el número de lados
	+ getInteriorAngle(): retorna ((n-2)*PI/n)
 * */

public interface PoligonoRegular {
	
	public final float PI =  3.1416f;

	public int getNumLados();
	
	public float getLongitudLados(float longiLados);
	
	default public float getPerimeter(float longiLados) {
		return getNumLados()*getLongitudLados(longiLados);
	}
	
	default public float getInteriorAngle(float longiLados) {
		return ((longiLados-2)*PI/longiLados);
	}
	
}
