package policy.sort;

import domain.LearnItem;

import java.util.Comparator;
import java.util.List;

public class LevelDesSort implements SortStrategy{

    @Override
    public List<LearnItem> sort(List<LearnItem> items) {
        return items.stream()
                .sorted(Comparator.comparing(LearnItem::getLevel).reversed())
                .toList();
    }
}
