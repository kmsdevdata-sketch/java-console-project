package policy.sort;

import domain.LearnItem;

import java.util.List;

public interface SortStrategy {
    List<LearnItem> sort();
}
