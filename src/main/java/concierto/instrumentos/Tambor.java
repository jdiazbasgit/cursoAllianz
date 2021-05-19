package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tamborcito")
@Qualifier("tocameAMi")
public class Tambor extends Instrumento {
	@Value("nada2")
	@Override
	public void setSonido(String sonido) {
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}
	

	
}
