package concierto.teatros;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.InstrumentoRotoException;
import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		ApplicationContext contexto= new ClassPathXmlApplicationContext("spring.xml");
		try {
			Solista solista= (Solista) contexto.getBean("solista");
			Solista solista1= (Solista) contexto.getBean("solista1");
			
			System.out.println("--- solista ----");
			solista.tocar();
			System.out.println("--- solista1 ----");
			solista1.tocar();
			System.out.println("--- cambia sonido solista --");
			solista.getInstrumento().setSonido("sonido cambiado");
			System.out.println("--- vuelve a tocar solista----");
			solista.tocar();
			System.out.println("---- vuelve a tocar solista1  ------");
			solista1.tocar();
		}  catch (InstrumentoRotoException e) {
			System.out.println("Señores se ha roto el instrumento, el concierto ha termonado");
		}
	}

}
