package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {

		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring.xml");
		HombreOrquesta hombreOrquesta= (HombreOrquesta) contexto.getBean("hombreOrquesta");
		hombreOrquesta.tocar();
	}

}
