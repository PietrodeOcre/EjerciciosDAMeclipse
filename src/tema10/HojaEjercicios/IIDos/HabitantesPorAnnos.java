package tema10.HojaEjercicios.IIDos;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HabitantesPorAnnos {
	
	public Map<Integer, Double> mapHabitantesMap = new TreeMap<Integer, Double>(new Comparator<Integer>() {
		
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		};
		
	});
	
	@Override
	public String toString() {
		return mapHabitantesMap.toString();
	}
	
	public void aniadePoblacionHabitantesPorAnio(int anio, double ciudadanos) {
		mapHabitantesMap.put(anio, ciudadanos);
	}
	
}
