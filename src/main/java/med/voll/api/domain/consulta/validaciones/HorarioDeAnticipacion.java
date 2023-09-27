package med.voll.api.domain.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DatosAgendarConsulta;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

public class HorarioDeAnticipacion {

    public void validar(DatosAgendarConsulta datos){
        var ahora = LocalDateTime.now();
        var horaDeconsulta = datos.fecha();
        var diferenciaDe30Minutos = Duration.between(ahora,horaDeconsulta).toMinutes()<30;

        if (diferenciaDe30Minutos){
            throw new ValidationException("Las consultas deben programarse con al menos 30 minutos de anticipacion");
        }
    }
}
