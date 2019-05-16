package ExamenTema10.Dos;

public class Municipio implements Comparable<Municipio>{
	
	private String provincia, municipio;
	private int anoCenso;
	
	public Municipio(String p, String m,
			int a) {
		this.provincia = p;
		this.municipio = m;
		this.anoCenso = a;
	}

	@Override
	public String toString() {
		return municipio + ", " + provincia + ", (" + anoCenso + ")";
	}

	public int compareTo(Municipio o) {
		
		int comparacion =  this.provincia.compareTo(o.provincia);
		
		if(comparacion !=0) {
			//Devuelve la comparacion entre los String de las calles
			return comparacion;
		}else {
			
			int comparacion2 = this.municipio.compareTo(o.municipio);
			
			if(comparacion2 !=0) {
				
				return comparacion2;
				
			}else {
				
				return this.anoCenso - o.anoCenso;
			
			}
			
			
		}
	}

	
}
