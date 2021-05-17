package concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import concierto.configuracion.Configuracion;
import concierto.configuracion.ConfiguracionAnotaciones;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.Solista;

public class ConciertoHompreOrquestaClases {

	public static void main(String[] args) {
		//ApplicationContext contexto= new AnnotationConfigApplicationContext(Configuracion.class);
		ApplicationContext contexto= new AnnotationConfigApplicationContext(ConfiguracionAnotaciones.class);

		Solista solista= (Solista) contexto.getBean("solista");
		solista.tocar();
		System.out.println("----------hombre orquesta---------");
		HombreOrquesta hombreOrquesta= (HombreOrquesta) contexto.getBean("hombreOrquesta");
		hombreOrquesta.tocar();
	}

}
