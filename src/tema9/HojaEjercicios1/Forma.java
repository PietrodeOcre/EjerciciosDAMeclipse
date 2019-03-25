package tema9.HojaEjercicios1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Forma {
	
	public Forma() {
		System.out.println(identidad());
	}

	@Override
	abstract public String toString();
	
	public String identidad() {
		LocalDate fecha = LocalDate.now();
		//String era = fecha.getEra();
		String fechaparseada = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return fechaparseada.toString() /*+ era.toString()*/;
	}	
	
}
