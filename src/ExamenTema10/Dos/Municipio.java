package ExamenTema10.Dos;

public class Municipio implements Comparable<Municipio>{ 
	private String provincia, municipio;
	private int anoCenso;

	public Municipio(String p, String m, int a) {
		this.provincia = p;
		this.municipio = m;
		this.anoCenso = a;
	}

	@Override
	public int compareTo(Municipio o) {
		// TODO Auto-generated method stub
		int comparacion = this.provincia.compareTo(o.provincia);
		if (comparacion != 0)
			return comparacion;
		else {
			int comparacionMunicipio = this.municipio.compareTo(o.municipio);
			
			if (comparacionMunicipio == 0) {
				return anoCenso - o.anoCenso;
			}
			return comparacionMunicipio;
		}
	}

	

	@Override
	public String toString() {
		return municipio + "," + provincia + "(" + anoCenso + ")";
	}

	


}