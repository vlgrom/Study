package Task_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<String> findLeapYearNames(AbstractAnimal[] animals) {
        List<String> leapYearNames = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (isLeapYear(animal.getBirthDate().getYear())) {
                leapYearNames.add(animal.getName());
            }
        }
        return leapYearNames;
    }

    @Override
    public List<AbstractAnimal> findOlderAnimal(AbstractAnimal[] animals, int age) {
        List<AbstractAnimal> olderAnimals = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (animal.getBirthDate().plusYears(age).isBefore(LocalDate.now())) {
                olderAnimals.add(animal);
            }
        }
        return olderAnimals;
    }

    @Override
    public void findDuplicate(AbstractAnimal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if (animals[i].equals(animals[j])) {
                    System.out.println("Дубликат найден: " + animals[i].getName());
                }
            }
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
