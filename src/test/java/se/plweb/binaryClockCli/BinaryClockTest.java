package se.plweb.binaryClockCli;

import static org.junit.jupiter.api.Assertions.*;

class BinaryClockTest {

    @org.junit.jupiter.api.Test
    void binaryTimeFrom0() {
        // Sunday 16 November 2025 00:00:00
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763251200000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom1() {
        // Sunday 16 November 2025 01:01:01
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763254861000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, false, false, true},
                {false, false, false, false},
                {false, false, false, true},
                {false, false, false, false},
                {false, false, false, true},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom2() {
        // Sunday 16 November 2025 02:02:02
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763258522000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, false, true, false},
                {false, false, false, false},
                {false, false, true, false},
                {false, false, false, false},
                {false, false, true, false},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom3() {
        // Sunday 16 November 2025 03:03:03
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763262183000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, false, true, true},
                {false, false, false, false},
                {false, false, true, true},
                {false, false, false, false},
                {false, false, true, true},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom4() {
        // Sunday 16 November 2025 04:04:04
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763265844000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, true, false, false},
                {false, false, false, false},
                {false, true, false, false},
                {false, false, false, false},
                {false, true, false, false},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom5() {
        // Sunday 16 November 2025 05:05:05
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763269505000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, true, false, true},
                {false, false, false, false},
                {false, true, false, true},
                {false, false, false, false},
                {false, true, false, true},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom6() {
        // Sunday 16 November 2025 06:06:06
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763273166000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, true, true, false},
                {false, false, false, false},
                {false, true, true, false},
                {false, false, false, false},
                {false, true, true, false},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom7() {
        // Sunday 16 November 2025 07:07:07
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763276827000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {false, true, true, true},
                {false, false, false, false},
                {false, true, true, true},
                {false, false, false, false},
                {false, true, true, true},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom8() {
        // Sunday 16 November 2025 08:08:08
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763280488000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {true, false, false, false},
                {false, false, false, false},
                {true, false, false, false},
                {false, false, false, false},
                {true, false, false, false},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom9() {
        // Sunday 16 November 2025 09:09:09
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763284149000L);
        boolean[][] expectedTime = {
                {false, false, false, false},
                {true, false, false, true},
                {false, false, false, false},
                {true, false, false, true},
                {false, false, false, false},
                {true, false, false, true},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom10() {
        // Sunday 16 November 2025 10:10:10
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763287810000L);
        boolean[][] expectedTime = {
                {false, false, false, true},
                {false, false, false, false},
                {false, false, false, true},
                {false, false, false, false},
                {false, false, false, true},
                {false, false, false, false},
        };
        assertArrayEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void binaryTimeFrom11() {
        // Sunday 16 November 2025 11:11:11
        boolean[][] actualTime = BinaryClock.binaryTimeFrom(1763291471000L);
        boolean[][] expectedTime = {
                {false, false, false, true},
                {false, false, false, true},
                {false, false, false, true},
                {false, false, false, true},
                {false, false, false, true},
                {false, false, false, true},
        };
        assertArrayEquals(expectedTime, actualTime);
    }
}