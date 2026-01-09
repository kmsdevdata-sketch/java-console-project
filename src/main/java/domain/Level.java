package domain;

public enum Level {
    BEGINNER(1), LOW(2), MEDIUM(3), HIGH(4), ADVANCED(5);

    private final int score;

    Level(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public static Level from(int input) {
        return switch (input) {
            case 1 -> BEGINNER;
            case 2 -> LOW;
            case 3 -> MEDIUM;
            case 4 -> HIGH;
            case 5 -> ADVANCED;
            default -> throw new IllegalArgumentException("[ERROR] 1~5까지의 숫자중 입력해주세요");
        };
    }
}
