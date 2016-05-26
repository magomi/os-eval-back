package com.tsystems.tc.mv.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * POC um Nutzerdaten an einem REST-Endpunkt zur Verfuegung zu stellen.
 *
 * @author Marco Grunert <marco.grunert@t-systems.com>
 */
@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BeEval {

    public static void main(String[] args) {
        SpringApplication.run(BeEval.class, args);
    }

    @Bean
    public CommandLineRunner startup(UserRepository repository) {
        return (args) -> {
            repository.save(new User("hans@mustermann.de", "Hans", "Mustermann"));
            repository.save(new User("jane@doe.org", "Jane", "Doe"));
            repository.save(new User("john@doe.org", "John", "Doe"));
            repository.save(new User("otto@nv.de", "Otto", "Normalverbraucher"));
        };
    }
}
