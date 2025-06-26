package org.example.ruacademyzoo.exeptions;

import java.text.MessageFormat;

public class AddTypeAnimalException extends Throwable {
    public AddTypeAnimalException(String notCorrectClass) {

        super (MessageFormat.format("В вальер добавляется дедопустимое животное с типом {0}", notCorrectClass));
    }
}
