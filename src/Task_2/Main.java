package Task_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();
        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl(createAnimalService);
        SearchService searchService = new SearchServiceImpl();

        AbstractAnimal[] animals = createAnimalServiceImpl.createDefaultAnimals().toArray(new AbstractAnimal[0]);

        // Результаты поиска
        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        System.out.println("Животные, родившиеся в високосный год: " + leapYearNames);

        List<AbstractAnimal> olderAnimals = searchService.findOlderAnimal(animals, 5);
        System.out.println("Животные старше 5 лет: " + olderAnimals.size());

        searchService.findDuplicate(animals);
    }
}