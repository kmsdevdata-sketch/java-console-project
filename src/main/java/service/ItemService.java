package service;

import command.CreateLearnItemCommand;
import command.UpdateLearnItemCommand;
import domain.LearnItem;
import dto.LearnItemSummary;
import repository.ItemRepository;

import java.util.List;

public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Long join(CreateLearnItemCommand command) {
        LearnItem learnItem = LearnItem.create(command);
        return itemRepository.save(learnItem);
    }

    public LearnItem getItem(Long id) {
        return itemRepository.findById(id);
    }

    public List<LearnItem> getAllItems() {
        return itemRepository.findAll();
    }

    public void update(LearnItem learnItem, UpdateLearnItemCommand command) {
        learnItem.update(command);
    }

    public void delete(Long id) {
        itemRepository.delete(id);
    }

    public List<LearnItemSummary> getItemSummaries() {
        return itemRepository.findAll().stream()
                .map(LearnItemSummary::from)
                .toList();
    }
}
