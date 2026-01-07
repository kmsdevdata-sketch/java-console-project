package command;

import domain.Category;
import domain.Level;

import java.util.Optional;

// 업데이트할때 사용할 클래스
public class UpdateLearnItemCommand {

    private Optional<String> title;
    private Optional<Category> category;
    private Optional<Level> level;
    private Optional<String> tag;
    private Optional<String> memo;

    public UpdateLearnItemCommand(
            Optional<String> title,
            Optional<Category> category,
            Optional<Level> level,
            Optional<String> tag,
            Optional<String> memo) {
        this.title = title;
        this.category = category;
        this.level = level;
        this.tag = tag;
        this.memo = memo;
    }

    public Optional<String> getTitle() {
        return title;
    }

    public Optional<Category> getCategory() {
        return category;
    }

    public Optional<Level> getLevel() {
        return level;
    }

    public Optional<String> getTag() {
        return tag;
    }

    public Optional<String> getMemo() {
        return memo;
    }

}
