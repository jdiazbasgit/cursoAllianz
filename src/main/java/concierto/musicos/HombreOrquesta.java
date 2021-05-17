package concierto.musicos;

import java.util.List;

import concierto.instrumentos.InstrumentoInterface;

public class HombreOrquesta implements MusicoInterface {
	
	private List<InstrumentoInterface> instrumentos;

	@Override
	public void tocar() {
		for (InstrumentoInterface instrumento : instrumentos) {
			System.out.println(instrumento.sonar());
		}

	}

	public List<InstrumentoInterface> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<InstrumentoInterface> instrumentos) {
		this.instrumentos = instrumentos;
	}

}
