package se.plweb.binaryClockCli;

import java.time.*;

public class BinaryClock {

    final private static int rows = 4;
    final private static int columns = 6;

    public static boolean[][] binaryTimeFrom(long fromEpochTimeInMs) {
        boolean[][] clock = new boolean[columns][rows];
        long[] timeGroups = new long[columns / 2];
        timeGroups[0] = fromEpochTimeInMs / (1000 * 60 * 60) % 24; // hours
        timeGroups[1] = fromEpochTimeInMs / (1000 * 60) % 60; // minutes
        timeGroups[2] = fromEpochTimeInMs / 1000 % 60; // seconds

        int column = 0;
        for (long timeGroup : timeGroups) {
            for (int digit = 0; digit < 2; digit++) {
                long cd = (digit % 2 == 0) ? timeGroup / 10 : timeGroup % 10;
                clock[column][0] = (cd == 8 || cd == 9);
                clock[column][1] = (cd >= 4 && cd <= 7);
                clock[column][2] = (cd == 2 || cd == 3 || cd == 6 || cd == 7);
                clock[column][3] = (cd % 2 != 0);
                column++;
            }
        }
        return clock;
    }

    public static String createClock(boolean[][] clock) {
        StringBuilder buffer = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                buffer.append(clock[column][row] ? "1" : "0");
                buffer.append(" ");
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }


    public static void main(String[] args) {

        long currentTimeInMillisInUTC = System.currentTimeMillis();
        long offsetInMillisFromUTCtoCurrentSystemTime = ZonedDateTime.now(ZoneId.systemDefault()).getOffset().getTotalSeconds() * 1000L;
        long currentSystemTimeInMillis = currentTimeInMillisInUTC + offsetInMillisFromUTCtoCurrentSystemTime;

        System.out.println(
                createClock(
                        binaryTimeFrom(
                                currentSystemTimeInMillis
                        )
                )
        );
    }
}
