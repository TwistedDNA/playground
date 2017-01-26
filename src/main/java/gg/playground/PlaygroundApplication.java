package gg.playground;

import gg.playground.entities.Gg;
import gg.playground.repositories.GgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication implements CommandLineRunner {

    @Autowired
    private GgRepository ggRepository;

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Gg g1 = new Gg("Victory");
        Gg g2 = new Gg("Zwyciestwo");

        ggRepository.save(g1);
        ggRepository.save(g2);
    }

}
