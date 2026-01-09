package policy.statistics;

import domain.Category;
import domain.LearnItem;
import domain.Level;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemStatistics {
    public Map<Category,Long> countByCategory(List<LearnItem> items) {
        return items.stream()
                .collect(Collectors.groupingBy(
                        LearnItem::getCategory,
                        Collectors.counting()
                ));
    }

    public Map<Level,Long> countByLevel(List<LearnItem> items) {
        return items.stream()
                .collect(Collectors.groupingBy(
                        LearnItem::getLevel,
                        Collectors.counting()
                ));
    }

    public double averageLevel(List<LearnItem> items) {
        return items.stream()
                .mapToInt(item -> item.getLevel().getScore())
                .average()
                .orElse(0.0);
    }
}
