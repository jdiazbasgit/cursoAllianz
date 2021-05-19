package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("guitarra")
public class Guitarra extends Instrumento {
	 
	//@Value("tlan, tlan, tlan con anotaciones")
	@Value("nada")
	@Override
	public void setSonido(String sonido) {
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}

	

	

}
