package de.mcmics;/*
 * Copyright (c) 2018.
 * Created by MCMicS
 */

import lombok.*;
import lombok.extern.java.Log;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.logging.Level;

@Log
@Value
@AllArgsConstructor
public class Sample {

    @Nonnull
    private final String name;

    public Sample() {
        this("Sample");
    }
}
