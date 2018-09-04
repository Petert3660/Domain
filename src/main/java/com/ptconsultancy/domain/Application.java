package com.ptconsultancy.domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run();
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
