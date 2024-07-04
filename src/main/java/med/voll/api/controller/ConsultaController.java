package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.consulta.*;
import med.voll.api.domain.paciente.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private AgendarConsultaService consultaService;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DatosAgendarConsulta datos){
        var responce = consultaService.agendar(datos);
        
        return ResponseEntity.ok(responce);
    }
}
