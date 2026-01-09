package view;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        return Integer.parseInt(scanner.nextLine());
    }

    public Long readLong() {
        return Long.parseLong(scanner.nextLine());
    }
}
