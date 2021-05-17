package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("tocameAMi")
public class Guitarra extends Instrumento {
	 
	//@Value("tlan, tlan, tlan con anotaciones")
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
