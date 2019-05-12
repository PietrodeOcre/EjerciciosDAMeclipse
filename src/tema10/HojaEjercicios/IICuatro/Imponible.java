package tema10.HojaEjercicios.IICuatro;

public class Imponible{
	
	private static int id=0;

	private Patrimonio patrimonio;
	
	
	
	public Imponible() {
		this.id++;
		this.setPatrimonio(patrimonio);
	}



	public int id() {
		// TODO Auto-generated method stub
		return id;
	}



	public int impuestos() {
		// TODO Auto-generated method stub
		return 0;
	}



	public Patrimonio getPatrimonio() {
		return patrimonio;
	}



	public void setPatrimonio(Patrimonio patrimonio) {
		this.patrimonio = patrimonio;
	}



	

}
