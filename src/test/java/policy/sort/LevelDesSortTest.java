package policy.sort;

import domain.Category;
import domain.LearnItem;
import domain.Level;
import org.junit.jupiter.api.Test;
import policy.search.TitleSearch;
import repository.ItemRepository;
import service.ItemService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelDesSortTest {
    ItemRepository itemRepository = new ItemRepository();
    ItemService itemService = new ItemService(itemRepository);
    LevelDesSort desSort = new LevelDesSort();

    @Test
    void sortTest() {
//        itemService.join(new LearnItem("spring1", Category.BACKEND, Level.HIGH, "java", "memo"));
//        itemService.join(new LearnItem("spring2", Category.INFRA, Level.BEGINNER, "java", "memo"));
//        itemService.join(new LearnItem("spring3", Category.DATABASE, Level.ADVANCED, "java", "memo"));

        List<LearnItem> result =
                desSort.sort(itemRepository.findAll());

        assertEquals(result.size(), 3);
        assertEquals(result.get(0).getLevel(),Level.ADVANCED);
    }
}