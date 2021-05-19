package concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import concierto.excepciones.InstrumentoRotoException;
import concierto.instrumentos.Instrumento;
import concierto.instrumentos.InstrumentoInterface;
import concierto.musicos.HombreOrquesta;
import concierto.musicos.MusicoInterface;
import concierto.musicos.Solista;

@Component
@Aspect
public class MecanicoDeInstrumentos {

	@Pointcut("execution(@concierto.anotaciones.Mecanico * *.*(..))")
	public void sujetador() {

	}

	@Around("sujetador()")
	public Object arreglarInstrumento(ProceedingJoinPoint joinpoint) throws InstrumentoRotoException {

		Object salida = null;
		MusicoInterface musico = (MusicoInterface) joinpoint.getTarget();
		try {
			// Before
			salida = joinpoint.proceed();
			// AfterRetuning
		} catch (Throwable e) {
			// AfterThrowing
			System.out.println("señores se ha roto el instrumento voy a arreglarlo");
			if (musico.getClass().isInstance(new Solista())) {
				Solista solista = (Solista) musico;
				if (solista.getInstrumento().getSonido().equals("nada"))
					solista.getInstrumento()
							.setSonido("sonido arreglado de " + solista.getInstrumento().getClass().getSimpleName());
				solista.tocar();
			} else {
				HombreOrquesta hombreOrquesta = (HombreOrquesta) musico;
				for (InstrumentoInterface instrumentoInterface : hombreOrquesta.getInstrumentos()) {

					Instrumento instrumento = (Instrumento) instrumentoInterface;
					if (instrumento.getSonido().equals("nada"))
						instrumento.setSonido("sonido arreglado de " + instrumento.getClass().getSimpleName());

				}
				hombreOrquesta.tocar();
			}

		} finally {
			// After
		}

		return salida;
	}

}
