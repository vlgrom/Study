package Task_2;

import java.time.LocalDate;

public class Wolf extends Predator {
    public Wolf(String name, Double cost, String character, LocalDate birthDate) {
        super(name, cost, character, birthDate);
        this.breed = "Wolf";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AbstractAnimal)) return false;
        AbstractAnimal animal = (AbstractAnimal) obj;
        return breed.equals(animal.breed) &&
                name.equals(animal.name) &&
                cost.equals(animal.cost) &&
                character.equals(animal.character) &&
                birthDate.equals(animal.birthDate);
    }
}
