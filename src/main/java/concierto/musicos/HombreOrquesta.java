package concierto.musicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import concierto.anotaciones.Mecanico;
import concierto.anotaciones.Vigilante;
import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.InstrumentoInterface;

@Component
public class HombreOrquesta implements MusicoInterface {
	
	@Autowired
	@Qualifier("tocameAMi")
	private List<InstrumentoInterface> instrumentos;

	
	@Vigilante
	@Mecanico
	public String tocar() throws InstrumentoRotoException {
		for (InstrumentoInterface instrumento : instrumentos) {
			System.out.println(instrumento.sonar());
		}
		return "hola";
	}

	public List<InstrumentoInterface> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<InstrumentoInterface> instrumentos) {
		this.instrumentos = instrumentos;
	}

}
