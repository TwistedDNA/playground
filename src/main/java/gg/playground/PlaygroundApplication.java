package gg.playground;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
    }

    @Override
    public void run(String... args) {

    }

}
