package controller;

import command.CreateLearnItemCommand;
import domain.LearnItem;
import domain.SearchCriteria;
import dto.LearnItemSummary;
import policy.search.*;
import repository.ItemRepository;
import service.ItemService;
import view.FormReader;
import view.Input;
import view.Output;

import java.util.List;
import java.util.Scanner;

public class ItemController {

    private final ItemRepository itemRepository;
    private final ItemService itemService;
    private final Input input;
    private final Output output;
    private final FormReader formReader;

    public ItemController(ItemRepository itemRepository, ItemService itemService, Input input, Output output, FormReader formReader) {
        this.itemRepository = itemRepository;
        this.itemService = itemService;
        this.input = input;
        this.output = output;
        this.formReader = formReader;
    }

    public void start() {
        while (true) {
            try {
                output.printMenu();
                int menu = input.readInt();
                if (menu == 0) {
                    break;
                }
                executeMenu(menu);
            } catch (IllegalArgumentException e) {

            }
        }
    }

    private void executeMenu(int menu) {
        if (menu == 1) {
            CreateLearnItemCommand command = formReader.read();
            itemService.join(command);
        }
        if (menu == 2) {
            List<LearnItemSummary> itemSummaries = itemService.getItemSummaries();
            output.printItemList(itemSummaries);
        }
        if (menu == 3) {
            output.printFindId();
            Long id = input.readLong();
            LearnItem item = itemService.getItem(id);

        }
        if (menu == 4) {
            output.printUpdateFindId();
            Long id = input.readLong();
            output.printSelectUpdateItem();
            int input = this.input.readInt();

        }
        if (menu == 5) {
            output.printDeleteFindId();
            Long id = input.readLong();

            if (confirmDelete()) {
                itemService.delete(id);
            }
        }
        if (menu == 6) {
            output.printSearchMenu();
            int selected = this.input.readInt();
            SearchCriteria searchCriteria = SearchCriteria.from(selected);
            output.printSearchKeyword(searchCriteria);
            String value = input.readString();

            SearchCondition searchCondition = searchCriteria.create(value);
            List<LearnItem> result = searchCondition.search(itemService.getAllItems());

            output.printSearchResult(result);
        }
        if (menu == 7) {

        }

    }

    private boolean confirmDelete() {
        while (true) {
            output.askAgainDelete();
            String answer = input.readString().trim().toLowerCase();
            if ("y".equals(answer)) return true;
            if ("n".equals(answer)) return false;
            output.printInvalidAnswer();
        }
    }
}

