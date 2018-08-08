/*
 * Copyright (c) 2018.
 * Created by MCMicS
 */
package de.mcmics;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.java.Log;

@Log
@Value
@AllArgsConstructor
public class Sample {

    private final String name;
    private final String title;

    public Sample() {
        this("Sample", "Title");
    }

    String callMe() {
        return getName() + getTitle();
    }
}
