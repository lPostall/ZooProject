package org.example.ruacademyzoo.objects;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.ruacademyzoo.exeptions.AgeException;

//Базовый класс всех животных
public abstract class Animal {

    private static final Logger log = LogManager.getLogger(Animal.class);

    protected final String name;
    //TODO перевести на date - дата рождения
    protected int age;


    public Animal(int age_, String name_) throws AgeException {
        log.trace("Создаем новое животное с именем {}, возраст{}", name_, age_);
        log.debug("Проверка значения возроста");


        this.name = name_;
        if (age_<0 || age_ > 5000){

            throw new AgeException(age_);
        }
        else {
            this.age=age_;
        }

        this.age = age_;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public abstract void makesound();


}
