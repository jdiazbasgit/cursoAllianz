package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.InstrumentoRotoException;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.MusicoInterface;

public class ConciertoHombreOrquestaAnotaciones {

	public static void main(String[] args) {
		
		
		ApplicationContext contexto= new ClassPathXmlApplicationContext("SpringAnotaciones.xml");
		MusicoInterface hombreOrquesta = (HombreOrquesta) contexto.getBean("hombreOrquesta");
		try {
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			// TODO Auto-generated catch block
			//System.out.println("Señores se ha roto el instrumento, el concierto ha termonado");
		}
	}

}
