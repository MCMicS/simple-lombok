package de.mcmics;/*
 * Copyright (c) 2018.
 * Created by MCMicS
 */

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.java.Log;

@Log
@Value
@AllArgsConstructor
public class Sample {

    private final String name;

    public Sample() {
        this("Sample");
    }
}
