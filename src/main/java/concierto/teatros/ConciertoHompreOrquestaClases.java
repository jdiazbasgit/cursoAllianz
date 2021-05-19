package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import concierto.configuracion.ConfiguracionAnotaciones;
import concierto.excepciones.InstrumentoRotoException;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.MusicoInterface;
import concierto.musicos.Solista;

public class ConciertoHompreOrquestaClases {

	public static void main(String[] args) {
		// ApplicationContext contexto= new
		// AnnotationConfigApplicationContext(Configuracion.class);
		ApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguracionAnotaciones.class);

		try {
			Solista solista = (Solista) contexto.getBean("solista");
			solista.tocar();
			System.out.println("----------hombre orquesta---------");
			MusicoInterface hombreOrquesta = (HombreOrquesta) contexto.getBean("hombreOrquesta");
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			//System.out.println("Señores se ha roto el instrumento, el concierto ha termonado");
		}
	}

}
