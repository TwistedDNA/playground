package gg.playground.entities;

import org.springframework.data.annotation.Id;

import java.time.LocalTime;

/**
 * Created by Maksym_Mazur on 3/29/2017.
 */
public class LocalTimeWrapper {

    @Id
    public String id;

    public LocalTime time;

    public LocalTimeWrapper() {
    }

    public LocalTimeWrapper(LocalTime time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

}
