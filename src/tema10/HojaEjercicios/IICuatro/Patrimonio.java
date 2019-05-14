package tema10.HojaEjercicios.IICuatro;

import java.util.HashSet;
import java.util.Set;

public class Patrimonio implements Imponible{
	
	Set<Propiedad> propiedadeSet = new HashSet<>();

	public void add(Inmueble p) {
		// TODO Auto-generated method stub
		propiedadeSet.add(p);
	}

	
	public Patrimonio() {
		super();
		
	}
	public Patrimonio(Propiedad p1, Propiedad p2) {
		super();
		this.propiedadeSet.add(p1);
		this.propiedadeSet.add(p2);
	}
	
	public Patrimonio(Propiedad p1, Inmueble p2) {
		super();
		this.propiedadeSet.add(p1);
		this.propiedadeSet.add(p2);
	}
	
	public Patrimonio(CtaBanco p1, Inmueble p2) {
		super();
		this.propiedadeSet.add(p1);
		this.propiedadeSet.add(p2);
	}
	
	public void impuestos(Set<Propiedad> propiedadeSet) {
		double impuestos = 0;
		for(Propiedad pro: propiedadeSet) {
			
			impuestos = impuestos + pro.impuestos();
		}
		
	}


	public String id() {
		
		
		// TODO Auto-generated method stub
		return "1";
	}

	
	
}
