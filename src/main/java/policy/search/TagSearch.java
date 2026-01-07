package policy.search;

import domain.LearnItem;

import java.util.List;

public class TagSearch implements SearchCondition{

    private final String tag;

    public TagSearch(String tag) {
        this.tag = tag;
    }

    @Override
    public List<LearnItem> search(List<LearnItem> items) {
        return items.stream()
                .filter(i -> i.getTag().equals(tag))
                .toList();
    }
}
