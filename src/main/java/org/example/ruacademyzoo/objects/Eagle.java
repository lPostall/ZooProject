package org.example.ruacademyzoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.example.ruacademyzoo.exeptions.AgeException;

public class Eagle extends Animal implements IFlyable {
    private static final Logger log = LogManager.getLogger(Eagle.class);


    public Eagle(int age_, String name_) throws AgeException {
        super(age_, name_);
    }

    @Override
    public void makesound() {
log.info("Kaappp");
    }

    @Override
    public boolean isBigBird() {
        return true;
    }

    @Override
    public void fly() {
        log.info("Орел с именем {} летит", getName());
    }
}
