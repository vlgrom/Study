package Task_2;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String name, Double cost, String character, LocalDate birthDate) {
        super(name, cost, character, birthDate);
        this.breed = "Cat";
    }
}
