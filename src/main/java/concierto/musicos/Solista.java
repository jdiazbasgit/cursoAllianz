package concierto.musicos;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.Tambor;

public class Solista implements MusicoInterface{
	
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
