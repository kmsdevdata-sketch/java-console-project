package dto;

import domain.Category;
import domain.LearnItem;
import domain.Level;

public class LearnItemSummary {

    private final Long id;
    private final String title;
    private final Category category;
    private final Level level;

    public LearnItemSummary(Long id, String title, Category category, Level level) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.level = level;
    }

    public static LearnItemSummary from(LearnItem item) {
        return new LearnItemSummary(
                item.getId(),
                item.getTitle(),
                item.getCategory(),
                item.getLevel()
        );
    }

    public Long getId() {return id;}

    public String getTitle() {return title;}

    public Category getCategory() {return category;}

    public Level getLevel() {return level;}
}
