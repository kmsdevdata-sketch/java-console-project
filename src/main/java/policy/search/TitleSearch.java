package policy.search;

import domain.LearnItem;
import repository.ItemRepository;
import service.ItemService;

import java.util.List;

public class TitleSearch implements SearchCondition {

    private final String title;

    public TitleSearch(String title) {
        this.title = title;
    }

    @Override
    public List<LearnItem> search(List<LearnItem> items) {
        return items.stream()
                .filter(i -> i.getTitle().equals(title))
                .toList();
    }
}
