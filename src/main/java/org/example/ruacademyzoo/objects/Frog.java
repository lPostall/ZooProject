package org.example.ruacademyzoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.ruacademyzoo.exeptions.AgeException;

public class Frog extends Animal implements ISwimmable {

    private static final Logger log = LogManager.getLogger(Frog.class);

    public Frog(int age_, String name_) throws AgeException {
        super(age_, name_);
    }

    @Override
    public void makesound() {
        log.info("ква-ква");
    }

    @Override
    public boolean isSultWater() {
        return false;
    }
}
