package org.example.ruacademyzoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.ruacademyzoo.exeptions.AgeException;

public class Lion extends Animal implements IDangerous, IGroundAnimal {

    private static final Logger log = LogManager.getLogger(Lion.class);

    public Lion(int age_, String name_) throws AgeException {
        super(age_, name_);
    }

    @Override
    public void makesound() {
log.info("*львиный рык*");
    }

    @Override
    public int dangerLevel() {
        return 20;
    }

    @Override
    public boolean isBigAnimal() {return true;}


}
