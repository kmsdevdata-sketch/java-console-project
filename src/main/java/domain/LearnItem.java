package domain;

import command.CreateLearnItemCommand;
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
        this.title = title;
        this.category = category;
        this.level = level;
        this.tag = tag;
        this.memo = memo;
        this.localDateTime = LocalDateTime.now();
    }

    public void update(UpdateLearnItemCommand command) {
        command.getTitle().ifPresent(t -> this.title = t);
        command.getCategory().ifPresent(c -> this.category = c);
        command.getLevel().ifPresent(l -> this.level = l);
        command.getTag().ifPresent(t -> this.tag = t);
        command.getMemo().ifPresent(m -> this.memo = m);
    }

    public static LearnItem create(CreateLearnItemCommand command) {
        return new LearnItem(
                command.getTitle(),
                command.getCategory(),
                command.getLevel(),
                command.getTag(),
                command.getMemo()
        );
    }

    @Override
    public String toString() {
        return  "id=" + id + "\n"+
                "title='" + title +"\n"+
                "category=" + category +"\n" +
                "level=" + level +"\n" +
                "tag='" + tag + "\n" +
                "memo='" + memo + "\n" +
                "localDateTime=" + localDateTime;
    }

    public void setId(Long id) {this.id = id;}
    public String getTitle() {return title;}
    public Category getCategory() {return category;}
    public Level getLevel() {return level;}
    public String getTag() {return tag;}
    public Long getId() {return id;}
    public LocalDateTime getLocalDateTime() {return localDateTime;}

}
