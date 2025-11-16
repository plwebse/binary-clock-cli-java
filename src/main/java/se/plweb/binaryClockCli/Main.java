package se.plweb.binaryClockCli;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int rows = 4;
        int columns = 6;
        boolean[][] clock = new boolean[columns][rows];
        long[] timeGroups = new long[columns / 2];
        long epochTimeMs = System.currentTimeMillis();
        timeGroups[0] = epochTimeMs / (1000 * 60 * 60) % 24; // hours
        timeGroups[1] = epochTimeMs / (1000 * 60) % 60; // minutes
        timeGroups[2] = epochTimeMs / 1000 % 60; // seconds

        int col = 0;
        for (long ct : timeGroups) {
            for (int number = 0; number < 2; number++) {
                long wct = (number % 2 == 0) ? ct / 10 : ct % 10;
                clock[col][0] = List.of(8L, 9L).contains(wct);
                clock[col][1] = List.of(4L, 5L, 6L, 7L).contains(wct);
                clock[col][2] = List.of(2L, 3L, 6L, 7L).contains(wct);
                clock[col][3] = (wct % 2 != 0);
                col++;
            }
        }

        StringBuilder buffer = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                buffer.append(clock[column][row] ? "1" : "0");
                buffer.append(" ");
            }
            buffer.append("\n");
        }
        System.out.println(buffer);
    }
}
