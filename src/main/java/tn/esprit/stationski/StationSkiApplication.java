package tn.esprit.stationski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class StationSkiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StationSkiApplication.class, args);
    }

}
