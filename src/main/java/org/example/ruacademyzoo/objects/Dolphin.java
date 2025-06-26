package org.example.ruacademyzoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.ruacademyzoo.exeptions.AgeException;

public class Dolphin extends Animal implements ISwimmable{

    private static final Logger log = LogManager.getLogger(Dolphin.class);

    public Dolphin(int age_, String name_) throws AgeException {
        super(age_, name_);
    }

    @Override
    public void makesound() {
        log.info("*звуки дельфина*");
    }

    @Override
    public boolean isSultWater() {return true;}
}
