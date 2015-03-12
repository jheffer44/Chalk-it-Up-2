package com.firebase.samples.logindemo.chalkitup.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author greg
 * @since 6/21/13
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {

    private static final String TAG = Game.class.getSimpleName();
    private String name;
    private String member;

    //Cache variables
    @JsonIgnore
    private String key;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Game() {
    }

    public Game(String name, String member) {

        this.name = name;
        this.member = member;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public String getMember() {
        return member;
    }
}