package concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.Tambor;

@Component
public class Solista implements MusicoInterface{
	
	@Autowired
	@Qualifier("tamborcito")
	private Instrumento instrumento;

	@Override
	public void tocar() {
		System.out.println(instrumento.sonar());
		
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	

}
