package tema10.HojaEjercicios.IIDos;

public class Ej21 {

	public static void main(String[] args) {
		CensoHistorico ch = new CensoHistorico();
		
		Municipio coslada = new Municipio("Coslada", "Madrid");
		
		Municipio sanFernando = new Municipio("San Fernando", "Madrid");
		
		Municipio otroSanFernando = new Municipio("San Fernando", "Cadiz");
		
		ch.añadeNumHabitantes(coslada, 2014, 25.0)
		.añadeNumHabitantes(new Municipio("Coslada", "Madrid"), 1988, 18.0)
		.añadeNumHabitantes(coslada, 2000, 29.0);
		
		HabitantesPorAnnos sn = ch.getHabitantes(coslada);
		
		System.out.println(sn);
		
		// años orden ascendente
		ch.añadeNumHabitantes(sanFernando, 2000, 23.0);
		
		ch.añadeNumHabitantes(otroSanFernando, 2002, 8.0);
		
		System.out.println(ch);
	}
}
