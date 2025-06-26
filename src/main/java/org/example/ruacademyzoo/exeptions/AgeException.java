package org.example.ruacademyzoo.exeptions;

public class AgeException extends Exception {
    public AgeException(int age) {

        super ("Некорректный возраст" + age);
    }
}
