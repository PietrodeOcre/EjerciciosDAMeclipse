package tema9.Interface1;

public class TrianguloEquilatero implements PoligonoRegular{
	
	public TrianguloEquilatero() {
		
	}
	
	public TrianguloEquilatero(int longiLados) {
		getLongitudLados(longiLados);
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
