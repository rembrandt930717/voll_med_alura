package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.consulta.DatosAgendarConsulta;

private PacienteRepository
public class PacienteActivo {
    public void validar(DatosAgendarConsulta datos){
        if (datos.idPaciente() == null){
            return;
        }

    }
}
