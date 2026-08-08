package be.he2b.dev2;

import be.he2b.dev2.td1.Td1Demo;
import be.he2b.dev2.td2.Td2Demo;
import be.he2b.dev2.td3.Td3Demo;
import be.he2b.dev2.td4.Td4Demo;
import be.he2b.dev2.td5.Td5Demo;
import be.he2b.dev2.td6.Td6Demo;
import be.he2b.dev2.td7.Td7Demo;
import be.he2b.dev2.td8.Td8Demo;
import be.he2b.dev2.td9.Td9Demo;
import be.he2b.dev2.td10.Td10Demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Entry point for the DEV2 - JAVL training project.
 *
 * <p>TD01-TD04 are plain console exercises, so this project uses Spring Boot
 * only as a runner: pass the TD you want to see as a program argument and its
 * demo runs to completion.
 */
@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class, args);
    }

    @Bean
    public CommandLineRunner dispatch() {
        return args -> {
            if (args.length == 0) {
                printUsage();
                return;
            }
            switch (args[0]) {
                case "td1" -> Td1Demo.run();
                case "td2" -> Td2Demo.run();
                case "td3" -> Td3Demo.run();
                case "td4" -> Td4Demo.run();
                case "td5" -> Td5Demo.run();
                case "td6" -> Td6Demo.run();
                case "td7" -> Td7Demo.run();
                case "td8" -> Td8Demo.run();
                case "td9" -> Td9Demo.run();
                case "td10" -> Td10Demo.run();
                default -> printUsage();
            }
        };
    }

    private void printUsage() {
        System.out.println("Usage : mvn spring-boot:run -Dspring-boot.run.arguments=<td1|td2|...|td10>");
    }
}
