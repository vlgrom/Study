package Task_2;

import java.time.LocalDate;

public class Shark extends Predator {
    public Shark(String name, Double cost, String character, LocalDate birthDate) {
        super(name, cost, character, birthDate);
        this.breed = "Shark";
    }
}
