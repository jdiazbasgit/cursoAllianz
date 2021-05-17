package concierto.musicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.instrumentos.InstrumentoInterface;

@Component
public class HombreOrquesta implements MusicoInterface {
	
	@Autowired
	//@Qualifier("tocameAMi")
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
