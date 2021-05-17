package concierto.instrumentos;

public class Trompeta extends Instrumento {
	private String sonido;

	@Override
	public String sonar() {
		// TODO Auto-generated method stub
		return getSonido();
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
