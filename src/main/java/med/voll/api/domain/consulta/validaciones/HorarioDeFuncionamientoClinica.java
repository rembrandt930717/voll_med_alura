package med.voll.api.domain.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DatosAgendarConsulta;
import med.voll.api.infra.errores.ValidacionDeIintegridad;

import java.time.DayOfWeek;

public class HorarioDeFuncionamientoClinica {
    public void validar(DatosAgendarConsulta datos){
        var anteDeApertura = datos.fecha().getHour() < 7;
        var despuesDecierre = datos.fecha().getHour() > 19;

        var domingo = DayOfWeek.SUNDAY.equals(datos.fecha().getDayOfWeek());
        if (domingo || anteDeApertura || despuesDecierre){
            throw new ValidationException("El horario de atencion de la clinica es de Lunes a Sabado, de 7:00 a 19:00 horas");
        }
    }
}
