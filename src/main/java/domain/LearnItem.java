package domain;

import command.UpdateLearnItemCommand;

import java.time.LocalDateTime;

public class LearnItem {
    private Long id;
    private String title;
    private Category category;
    private Level level;
    private String tag;
    private String memo;
    private LocalDateTime localDateTime;


    public LearnItem(String title, Category category, Level level, String tag, String memo) {
        this.id = ++id;
        this.title = title;
        this.category = category;
        this.level = level;
        this.tag = tag;
        this.memo = memo;
        setLocalDateTime();
    }

    public void update(UpdateLearnItemCommand command) {
        command.getTitle().ifPresent(t -> this.title = t);
        command.getCategory().ifPresent(c -> this.category = c);
        command.getLevel().ifPresent(l -> this.level = l);
        command.getTag().ifPresent(t -> this.tag = t);
        command.getMemo().ifPresent(m -> this.memo = m);
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public Level getLevel() {
        return level;
    }

    public String getTag() {
        return tag;
    }

    public Long getId() {
        return id;
    }

    public void setLocalDateTime() {
        this.localDateTime = LocalDateTime.now();
    }
}
