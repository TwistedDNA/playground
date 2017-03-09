package gg.playground.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * Created by Maksym_Mazur on 3/9/2017.
 */
@RestController
public class CurrentServerTimeController {

    @RequestMapping("/time")
    public LocalTime time() {
        return LocalTime.now();
    }

}
