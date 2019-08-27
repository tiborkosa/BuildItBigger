package com.udacity.gradle.builditbigger.backend;

public class Joke {
    private String joke;

    Joke(String joke){
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
