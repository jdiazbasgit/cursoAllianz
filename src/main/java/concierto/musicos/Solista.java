package concierto.musicos;

import concierto.instrumentos.InstrumentoInterface;

public class Solista implements MusicoInterface{
	
	private InstrumentoInterface instrumento;

	@Override
	public void tocar() {
		System.out.println(instrumento.sonar());
		
	}

	public InstrumentoInterface getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(InstrumentoInterface instrumento) {
		this.instrumento = instrumento;
	}

}
