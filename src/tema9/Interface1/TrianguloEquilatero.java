package tema9.Interface1;

/*
 * Crea una clase TrianguloEquilatero que implemente 
 * la interfaz. El método getNumLados retornará 3 y 
 * getLongitudLados devolverá un valor que será 
 * establecido en el constructor.
 */

public class TrianguloEquilatero implements PoligonoRegular{
	float longiLados;
	public TrianguloEquilatero(float longiLados) {
		super();
		getLongitudLados(longiLados);
		this.longiLados = longiLados;
	}
	
	

	public float getLongiLados1() {
		return longiLados;
	}

	@Override
	public int getNumLados() {
		// TODO Auto-generated method stub
		return 3;
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
