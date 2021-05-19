package concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.anotaciones.Vigilante;
import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.Tambor;

@Component
public class Solista implements MusicoInterface{
	
	@Autowired
	@Qualifier("guitarra")
	private Instrumento instrumento;

	   
	@Vigilante
	public String tocar() throws InstrumentoRotoException {
		System.out.println(instrumento.sonar());
		return "hola";
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	

}
