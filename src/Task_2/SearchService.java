package Task_2;

import java.util.List;

public interface SearchService {
    List<String> findLeapYearNames(AbstractAnimal[] animals);
    List<AbstractAnimal> findOlderAnimal(AbstractAnimal[] animals, int age);
    void findDuplicate(AbstractAnimal[] animals);
}
