package com.example.joketeller;

import java.util.Random;

public class Jokes {
    public String getJoke() {
        Random r = new Random();
        int randomNumber = r.nextInt((jokes.length - 1) + 1) + 0;

        return jokes[randomNumber];
    }

    private static final String[] jokes = {
            "There were two peanuts walking down a dark alley, on was assaulted.",
            "What do you call a sleepwalking nun... A roamin' Catholic.",
            "How do you make holy water? You boil the hell out of it.",
            "What did the 0 say to the 8? Nice belt!",
            "Qhy did the orange stop? Because, it ran outta juice."
    };
}
