package tn.esprit.stationski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAspectJAutoProxy
@SpringBootApplication
public class StationSkiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StationSkiApplication.class, args);
    }

}
