package repository;

import domain.LearnItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemRepository {
    private static final Map<Long, LearnItem> store = new HashMap<>();
    private static Long id = 0L;

    public Long save(LearnItem learnItem) {
        learnItem.setId(++id);
        store.put(id, learnItem);
        return learnItem.getId();
    }

    public LearnItem findById(Long id) {
        return store.get(id);
    }

    public List<LearnItem> findAll() {
        return new ArrayList<>(store.values());
    }

    public void delete(Long id) {
        store.remove(id);
    }

}
