package med.voll.api.medico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico(@NotNull
                                  @NotBlank
                                  String nombre,
                                  @NotNull
                                  @NotBlank
                                  String email,
                                  @NotNull
                                  @NotBlank
                                  String telefono,
                                  @NotBlank
                                  @Pattern(regexp = "\\d{4,6}")
                                  String documento,
                                  @NotNull
                                  Especialidad especialidad,
                                  @NotNull
                                  DatosDireccion direccion) {
}
