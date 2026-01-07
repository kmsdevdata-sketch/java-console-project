package policy.search;

import domain.Category;
import domain.LearnItem;
import service.ItemService;

import java.util.List;

public class CategorySearch implements SearchCondition {

    private final Category category;

    public CategorySearch(Category category) {
        this.category = category;
    }


    @Override
    public List<LearnItem> search(List<LearnItem> items) {
        return items.stream()
                .filter(i -> i.getCategory().equals(category))
                .toList();
    }
}
