package med.voll.api.domain.paciente;

import med.voll.api.domain.medico.DatosListadoMedico;

public record DatosListadoPaciente(Long id, String nombre, String email, String documento) {
    public DatosListadoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getDocumento());
    }
}
