package policy.search;

import domain.LearnItem;

import java.util.List;

public interface SearchCondition {
    List<LearnItem> search(List<LearnItem> items);
}
