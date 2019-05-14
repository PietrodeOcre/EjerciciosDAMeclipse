package tema10.HojaEjercicios.IITres;

public class EntradaPreferente extends Entrada{
	
	public String codigoReserva;

	/*public EntradaPreferente(Entrada entrada, String codigoReserva) {
		super(entrada, codigoReserva);
		this.codigoReserva = codigoReserva;
	}*/

	public EntradaPreferente(String string, double d, Evento evento) {
		super(string, d, evento);
		
	}
	
	public EntradaPreferente(String string, double d, Evento evento, String codigoReserva) {
		super(string, d, evento);
		this.codigoReserva = codigoReserva;
	}

	public String getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	
	@Override
	protected Double precioFinal(Evento evento) {
		precioFinal = super.precioFinal(evento);
		
		if (this.codigoReserva != null) {
			precioFinal = precioFinal+precioBase() * 0.2;
		}else {
			precioFinal = precioFinal+precioBase() * 0.1;
		}
		
		return precioFinal;
	}

}
