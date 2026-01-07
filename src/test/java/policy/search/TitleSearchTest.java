package policy.search;

import domain.Category;
import domain.LearnItem;
import domain.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.ItemRepository;
import service.ItemService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TitleSearchTest {
    ItemRepository itemRepository = new ItemRepository();
    ItemService itemService = new ItemService(itemRepository);
    TitleSearch titleSearch = new TitleSearch("spring1");


    @Test
    void searchTest() {
        itemService.join(new LearnItem("spring1", Category.BACKEND, Level.HIGH, "java", "memo"));
        itemService.join(new LearnItem("spring2", Category.INFRA, Level.BEGINNER, "java", "memo"));
        itemService.join(new LearnItem("spring3", Category.DATABASE, Level.ADVANCED, "java", "memo"));

        List<LearnItem> result =
                titleSearch.search(itemRepository.findAll());

        assertEquals(1, result.size());
        assertEquals("spring1", result.get(0).getTitle());
    }

}