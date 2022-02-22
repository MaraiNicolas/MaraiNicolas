package com.example.demo.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/persona")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    @PostMapping
    public void registrarPersona(@RequestBody Persona persona){
        personaService.addNewPersona(persona);
    }

    @PutMapping(path = "{personaId}")
    public void modificarSexoPersona(
            @PathVariable("personaId") Long personaId,
            @RequestParam(required = false) Sexo sexo){
        personaService.modificarSexoPersona(personaId, sexo);
    }
}
