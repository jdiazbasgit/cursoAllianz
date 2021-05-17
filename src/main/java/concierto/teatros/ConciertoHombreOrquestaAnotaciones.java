package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.musicos.HombreOrquesta;
import concierto.musicos.Solista;

public class ConciertoHombreOrquestaAnotaciones {

	public static void main(String[] args) {
		
		
		ApplicationContext contexto= new ClassPathXmlApplicationContext("SpringAnotaciones.xml");
		HombreOrquesta hombreOrquesta = (HombreOrquesta) contexto.getBean("hombreOrquesta");
		hombreOrquesta.tocar();
	}

}
