package org.example.ruacademyzoo.objects;

import org.example.ruacademyzoo.exeptions.AddTypeAnimalException;
import org.example.ruacademyzoo.exeptions.MaxCapacityException;

import java.util.Set;
//Вальер для наземных животных
public class GroundEnclosure extends Enclosure {

    public GroundEnclosure(int maxCapacity_) throws MaxCapacityException {
        super(maxCapacity_);
    }

    @Override
    public void addAnimal(Animal animal) throws AddTypeAnimalException {

        if (animal instanceof IGroundAnimal) {
            super.addAnimal(animal);

        } else {
            throw new AddTypeAnimalException(animal.getClass().getSimpleName());
        }



    }



}
