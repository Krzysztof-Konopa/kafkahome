package org.exercise.admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class KafkaAdminMain extends SpringBootServletInitializer implements CommandLineRunner {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KafkaAdminMain.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(KafkaAdminMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Started !!");
    }
}
