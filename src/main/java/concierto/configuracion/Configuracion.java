package concierto.configuracion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.Solista;

//@Configuration
public class Configuracion {

	@Bean(name = "tambor")
	public Instrumento getIstrumetoTambor() {

		Instrumento tambor = new Instrumento();
		tambor.setSonido("pom, pom, pom en clase");
		return tambor;
	}
	
	@Bean(name = "trompeta")
	public Instrumento getIstrumetoTrompeta() {

		Instrumento tambor = new Instrumento();
		tambor.setSonido("tuu, tuuu, tuuu en clase");
		return tambor;
	}
	@Bean(name = "guitarra")
	public Instrumento getIstrumetoGuitarra() {

		Instrumento tambor = new Instrumento();
		tambor.setSonido("tlan, tlan tlan  en clase");
		return tambor;
	}

	@Bean(name = "solista")
	public Solista getSolista() {
		Solista solista = new Solista();
		solista.setInstrumento(getIstrumetoTambor());
		return solista;
	}
	@Bean(name = "solista1")
	public Solista getSolista1() {
		Solista solista = new Solista();
		solista.setInstrumento(getIstrumetoTrompeta());
		return solista;
	}
	
	@Bean(name = "hombreOrquesta")
	public HombreOrquesta getHombreOrquesta() {
		HombreOrquesta hombreOrquesta= new HombreOrquesta();
		List<InstrumentoInterface> instrumentos= new ArrayList<InstrumentoInterface>();
		instrumentos.add(getIstrumetoGuitarra());
		instrumentos.add(getIstrumetoTambor());
		instrumentos.add(getIstrumetoTrompeta());
		hombreOrquesta.setInstrumentos(instrumentos);
		
		return hombreOrquesta;
		
	}

}
