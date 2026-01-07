package policy.search;

import domain.LearnItem;
import domain.Level;

import java.util.List;

public class LevelSearch implements SearchCondition{

    private final Level level;

    public LevelSearch(Level level) {
        this.level = level;
    }

    @Override
    public List<LearnItem> search(List<LearnItem> items) {
        return items.stream()
                .filter(i -> i.getLevel().equals(level))
                .toList();
    }

}
