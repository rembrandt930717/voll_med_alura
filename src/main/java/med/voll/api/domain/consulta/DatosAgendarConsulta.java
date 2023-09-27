package med.voll.api.domain.consulta;


import med.voll.api.domain.medico.Especialidad;

import java.time.LocalDateTime;

public record DatosAgendarConsulta(Long id, Long idPaciente, Long idMedico, LocalDateTime fecha, Especialidad especialidad) {
}
