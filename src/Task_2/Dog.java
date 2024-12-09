package Task_2;

import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(String name, Double cost, String character, LocalDate birthDate) {
        super(name, cost, character, birthDate);
        this.breed = "Dog";
    }
}
