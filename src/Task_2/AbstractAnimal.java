package Task_2;

import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
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

