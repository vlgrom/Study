package Task_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalService {
    private final Random random = new Random();

    public List<AbstractAnimal> createDefaultAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            animals.add(createAnimal());
            count++;
        }
        return animals;
    }

    public List<AbstractAnimal> createAnimals(int N) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            animals.add(createAnimal());
        }
        return animals;
    }

    public List<AbstractAnimal> createAnimalsDoWhile(int N) {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        do {
            animals.add(createAnimal());
            count++;
        } while (count < N);
        return animals;
    }

    private AbstractAnimal createAnimal() {
        String name = "Animal" + random.nextInt(100);
        Double cost = random.nextDouble() * 100;
        String character = "Friendly";
        LocalDate birthDate = LocalDate.now().minusDays(random.nextInt(365 * 10));

        if (random.nextBoolean()) {
            return new Dog(name, cost, character, birthDate);
        } else {
            return new Cat(name, cost, character, birthDate);
        }
    }
}
