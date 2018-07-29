package de.mcmics;

import lombok.extern.java.Log;

@Log
public class Application {

    public static void main(String[] args)  {
        Sample sample = new Sample();
        log.info("Sample Value: " + sample.getName());
        log.info("Sample Title: " + sample.getTitle());
    }
}
