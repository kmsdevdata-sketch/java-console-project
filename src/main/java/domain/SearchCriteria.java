package domain;

import policy.search.*;

public enum SearchCriteria {

    TITLE("제목 입력 :"){
        @Override
        public SearchCondition create(String input) {
            return new TitleSearch(input);
        }
    },
    CATEGORY("카테고리 입력 :") {
        @Override
        public SearchCondition create(String input) {
            Category category = Category.from(Integer.parseInt(input));
            return new CategorySearch(category);
        }
    },
    TAG("태그 입력") {
        @Override
        public SearchCondition create(String input) {
            return new TagSearch(input);
        }
    },
    LEVEL("레벨 입력") {
        @Override
        public SearchCondition create(String input) {
            Level level = Level.from(Integer.parseInt(input));
            return new LevelSearch(level);
        }
    };

    private final String prompt;

    SearchCriteria(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public static SearchCriteria from(int input) {
        return switch (input) {
            case 1 -> TITLE;
            case 2 -> CATEGORY;
            case 3 -> TAG;
            case 4 -> LEVEL;
            default -> throw new IllegalArgumentException("잘못된 검색 기준");
        };
    }

    public abstract SearchCondition create(String input);
}
