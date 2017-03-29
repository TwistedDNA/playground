package gg.playground.controllers;

import gg.playground.entities.LocalTimeWrapper;
import gg.playground.repositories.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * Created by Maksym_Mazur on 3/29/2017.
 */
@RestController
public class LoggingTimeController {

    @Autowired
    private TimeRepository timeRepository;

    @RequestMapping("/loggingTime")
    public LocalTime time() {
        LocalTime time = LocalTime.now();
        timeRepository.save(new LocalTimeWrapper(time));
        return time;
    }

}
