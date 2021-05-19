package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tocameAMi")
public class Trompeta extends Instrumento {
	
	

	
	@Override
	@Value("tuuu en clases")
	public void setSonido(String sonido) {
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}
}
