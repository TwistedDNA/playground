package gg.playground.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by Maksym_Mazur on 1/26/2017.
 */
public class GamerProfile {

    @Id
    private String id;
    private String nickname;
    private String login;

    public GamerProfile(String login, String nickname) {
        this.login = login;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
