package com.example.demo.Persona;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    public void addNewPersona(Persona persona) {

        Optional<Persona> personaPorDni = personaRepository
                .findPersonaByDni(persona.getDni());
        if(personaPorDni.isPresent()){
            throw new IllegalStateException("Ya existe una persona con este dni");
        }
        personaRepository.save(persona);
    }

    public void modificarSexoPersona(Long personaId,
                                     @NotNull Sexo sexo){
        Persona persona = personaRepository.findById(personaId).orElseThrow(() -> new IllegalStateException(
                "La persona con el id" + personaId + " no está registrada"
        ));
        if(!sexo.equals(persona.getSexo())){
            persona.setSexo(sexo);
        }

    }
}

