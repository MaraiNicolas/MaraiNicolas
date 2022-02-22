package com.example.demo.Persona;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PersonaConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonaRepository repository){
        return args ->{
            Persona jose = new Persona(
                    1L,
                    "Jose",
                    "Perez",
                    "40265789",
                    LocalDate.of(1997, Month.APRIL, 22),
                    Sexo.MASCULINO
            );
            Persona  maria = new Persona(
                            2L,
                            "Maria",
                            "Sosa",
                            "16999421",
                            LocalDate.of(1960, Month.FEBRUARY, 2),
                            Sexo.FEMENINO
            );

            repository.saveAll(
                    List.of(jose, maria)
            );
        };
    }
}
