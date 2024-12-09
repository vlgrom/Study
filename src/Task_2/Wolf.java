package Task_2;

import java.time.LocalDate;

public class Wolf extends Predator {
    public Wolf(String name, Double cost, String character, LocalDate birthDate) {
        super(name, cost, character, birthDate);
        this.breed = "Wolf";
    }
}
