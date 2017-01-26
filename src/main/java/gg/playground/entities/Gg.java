package gg.playground.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by Maksym_Mazur on 1/26/2017.
 */
public class Gg {

    @Id
    private String id;
    private String name;

    public Gg(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
