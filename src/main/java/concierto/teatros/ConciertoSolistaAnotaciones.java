package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.InstrumentoRotoException;
import concierto.musicos.MusicoInterface;
import concierto.musicos.Solista;

public class ConciertoSolistaAnotaciones {

	public static void main(String[] args) {
		
		
		ApplicationContext contexto= new ClassPathXmlApplicationContext("SpringAnotaciones.xml");
		MusicoInterface solista= (Solista) contexto.getBean("solista");
		try {
			solista.tocar();
		} catch (InstrumentoRotoException e) {
			System.out.println("Señores se ha roto el instrumento, el concierto ha termonado");
		}
	}

}
