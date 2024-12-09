package Task_2;

import java.time.LocalDate;

public class Pet extends AbstractAnimal {
    public Pet(String name, Double cost, String character, LocalDate birthDate) {
        super("Pet", name, cost, character, birthDate);
    }
}
