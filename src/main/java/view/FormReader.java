package view;

import command.CreateLearnItemCommand;
import domain.Category;
import domain.Level;

public class FormReader {
    private final Input input;
    private final Output output;

    public FormReader(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public CreateLearnItemCommand read() {
        output.printTitleInput();
        String title = input.readString();

        output.printCategoryInput();
        Category category = Category.valueOf(input.readString());

        output.printLevelInput();
        Level level = Level.from(input.readInt());

        output.printTagInput();
        String tag = input.readString();

        output.printMemoInput();
        String memo = input.readString();

        return new CreateLearnItemCommand(
                title,
                category,
                level,
                tag,
                memo
        );
    }
}
