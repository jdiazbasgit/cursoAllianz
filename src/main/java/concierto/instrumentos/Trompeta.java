package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tocameAMi")
public class Trompeta extends Instrumento {
	
	private String sonido;

	
	public String getSonido() {
		return sonido;
	}
	@Value("nada")
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
