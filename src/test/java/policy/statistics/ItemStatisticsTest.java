package policy.statistics;

import domain.Category;
import domain.LearnItem;
import domain.Level;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.ItemRepository;
import service.ItemService;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ItemStatisticsTest {

    ItemRepository itemRepository;
    ItemService itemService;
    ItemStatistics statistics;

    @BeforeEach
    void setUp() {
        itemRepository = new ItemRepository();
        itemService = new ItemService(itemRepository);
        statistics = new ItemStatistics();

//        itemService.join(new LearnItem("spring1", Category.BACKEND, Level.HIGH, "java", "memo"));
//        itemService.join(new LearnItem("spring2", Category.INFRA, Level.BEGINNER, "java", "memo"));
//        itemService.join(new LearnItem("spring3", Category.DATABASE, Level.ADVANCED, "java", "memo"));
    }

    @Test
    void averageTest() {
        double avg = statistics.averageLevel(itemRepository.findAll());
        assertEquals(3.333, avg, 0.001);
    }

    @Test
    void countByCategoryTest() {
        Map<Category, Long> result = statistics.countByCategory(itemRepository.findAll());
        assertEquals(1L, result.get(Category.BACKEND));
        assertEquals(1L, result.get(Category.INFRA));
        assertEquals(1L, result.get(Category.DATABASE));
    }

}