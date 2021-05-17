package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import concierto.configuracion.Configuracion;
import concierto.musicos.HombreOrquesta;

public class ConciertoSolistaClases {

	public static void main(String[] args) {
		ApplicationContext contexto= new AnnotationConfigApplicationContext(Configuracion.class);
		HombreOrquesta hombreOrquesta= (HombreOrquesta) contexto.getBean("hombreOrquesta");
		hombreOrquesta.tocar();
	}

}
