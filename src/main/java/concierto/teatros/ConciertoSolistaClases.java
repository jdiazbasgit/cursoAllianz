package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import concierto.configuracion.Configuracion;
import concierto.excepciones.InstrumentoRotoException;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.MusicoInterface;

public class ConciertoSolistaClases {

	public static void main(String[] args) {
		ApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		MusicoInterface hombreOrquesta = (HombreOrquesta) contexto.getBean("hombreOrquesta");
		try {
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			System.out.println("Señores se ha roto el instrumento, el concierto ha termonado");
		}
	}

}
