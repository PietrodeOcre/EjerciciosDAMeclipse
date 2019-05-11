package tema10.HojaEjercicios.IIDos;

import java.util.HashMap;
import java.util.Map;

public class CensoHistorico {
	
	
	private Double habitanteDouble;
	public Map<Municipio, HabitantesPorAnnos> censosMunicipales = new HashMap<Municipio, HabitantesPorAnnos>();
	public String toString() { 
		return censosMunicipales.toString(); 
	}
	public CensoHistorico añadeNumHabitantes(Municipio municipio, int anio, double habitantes) {

		if (censosMunicipales.containsKey(municipio)) {
			censosMunicipales.get(municipio).aniadePoblacionHabitantesPorAnio(anio, habitantes);
		}else {
			HabitantesPorAnnos habitantesPorAnioAnnos = new HabitantesPorAnnos();
			habitantesPorAnioAnnos.aniadePoblacionHabitantesPorAnio(anio, habitantes);		
			censosMunicipales.put(municipio, habitantesPorAnioAnnos);
		}

		return this;
	}
	public HabitantesPorAnnos getHabitantes(Municipio municipio) {
		// TODO Auto-generated method stub
		return censosMunicipales.get(municipio);
	}
	public Double getHabitanteDouble() {
		return habitanteDouble;
	}
	public void setHabitanteDouble(Double habitanteDouble) {
		this.habitanteDouble = habitanteDouble;
	}
	
	
	
}
