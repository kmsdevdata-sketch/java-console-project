package command;

import domain.Category;
import domain.Level;

public class CreateLearnItemCommand {
    private final String title;
    private final Category category;
    private final Level level;
    private final String tag;
    private final String memo;

    public CreateLearnItemCommand(
            String title,
            Category category,
            Level level,
            String tag,
            String memo
    ) {
        this.title = title;
        this.category = category;
        this.level = level;
        this.tag = tag;
        this.memo = memo;
    }

    public String getTitle() { return title; }
    public Category getCategory() { return category; }
    public Level getLevel() { return level; }
    public String getTag() { return tag; }
    public String getMemo() { return memo; }
}
