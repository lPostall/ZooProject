package org.example.ruacademyzoo.objects;

import org.example.ruacademyzoo.exeptions.AddTypeAnimalException;
import org.example.ruacademyzoo.exeptions.MaxCapacityException;

import java.util.HashSet;
import java.util.Set;

public abstract class Enclosure {

    protected final int maxCapacity; //максимальная вместимость вальера.
    protected final Set<Animal> animals;

    protected Enclosure(int maxCapacity_) throws MaxCapacityException {
        if (maxCapacity_ < 0 || maxCapacity_ > 500) {
            throw new MaxCapacityException (maxCapacity_);

        }

        this.maxCapacity = maxCapacity_;
        this.animals = new HashSet<Animal>();
    }

    public void addAnimal(Animal animal) throws AddTypeAnimalException {
        animals.add(animal);

    }


}
