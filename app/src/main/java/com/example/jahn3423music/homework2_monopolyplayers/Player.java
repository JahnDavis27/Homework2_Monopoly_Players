package com.example.jahn3423music.homework2_monopolyplayers;

/**
 * Created by Jahn3423Music on 10/20/2016.
 */


/**
 * Player data holder for monopoly players
 */
public class Player {

    private int id;
    private String email;
    private String name;

    public Player(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public String getId() {
        return "" + id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
