package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		ApplicationContext contexto= new ClassPathXmlApplicationContext("spring.xml");
		Solista solista= (Solista) contexto.getBean("solista");
		solista.tocar();

	}

}
