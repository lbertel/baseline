package io.ps.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
    "io.ps.web",
    "io.ps.shared",
    "io.ps.app",
    "io.ps.infra",
    "io.ps.infra.clients.persistence",
    "io.ps.domain",
})
public class Starter {

    public static void main(String ... args){
        SpringApplication.run(Starter.class, args);
    }

}
