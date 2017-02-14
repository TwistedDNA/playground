package gg.playground.entities;


import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Maksym_Mazur on 1/26/2017.
 */
public class Day {

    @Id
    private String id;
    private LocalDate date;
    private List<Activity> activities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
