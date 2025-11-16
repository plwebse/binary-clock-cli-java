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

}