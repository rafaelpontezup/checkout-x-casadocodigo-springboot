package br.com.zup.edu.casadocodigo.autores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NovoAutorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NovoAutorController.class);

    private AutorRepository repository;

    @Autowired
    public NovoAutorController(AutorRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/api/autores")
    public ResponseEntity<?> criar(@Valid @RequestBody NovoAutorRequest request) {

        LOGGER.info("request=" + request);

        // converteando o DTO (request) para uma entidade
        // ou seja, convertendo UM modelo para OUTRO modelo
        Autor autor = request.toModel();
        repository.save(autor);

        NovoAutorResponse response = new NovoAutorResponse(autor); // não necessário na atividade
        return ResponseEntity.ok(response);
    }

}
