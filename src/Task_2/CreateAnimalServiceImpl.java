package Task_2;

import java.util.ArrayList;
import java.util.List;

public class CreateAnimalServiceImpl {
    private final CreateAnimalService createAnimalService;

    public CreateAnimalServiceImpl(CreateAnimalService createAnimalService) {
        this.createAnimalService = createAnimalService;
    }

    public List<AbstractAnimal> createAnimalsWithFor(int N) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            animals.add(createAnimalService.createAnimal());
        }
        return animals;
    }

    public List<AbstractAnimal> createAnimalsWithDoWhile(int N) {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        do {
            animals.add(createAnimalService.createAnimal());
            count++;
        } while (count < N);
        return animals;
    }

    public List<AbstractAnimal> createDefaultAnimals() {
        return createAnimalService.createDefaultAnimals();
    }
}
