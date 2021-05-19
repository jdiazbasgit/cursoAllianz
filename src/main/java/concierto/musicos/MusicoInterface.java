package concierto.musicos;

import concierto.excepciones.InstrumentoRotoException;

public interface MusicoInterface {
	
	public String tocar() throws InstrumentoRotoException;

}
