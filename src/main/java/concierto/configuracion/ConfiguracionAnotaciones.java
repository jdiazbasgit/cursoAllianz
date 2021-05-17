package concierto.configuracion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import concierto.instrumentos.Guitarra;

@Configuration
@ComponentScan(value = {"concierto.instrumentos","concierto.musicos"})
public class ConfiguracionAnotaciones {

	
	
	@Bean
	@Qualifier("tocameAMi")
	public Guitarra getGuitarra() {
		Guitarra guitarra= new Guitarra();
		guitarra.setSonido("sonido de guitarra");
		return guitarra;
	}
}
