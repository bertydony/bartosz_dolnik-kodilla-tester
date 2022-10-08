package com.kodilla.stream.homework;
import com.kodilla.stream.optional.homework.Application;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void avg1Test() {
        double result = ForumStats.avg1();
        double expectedValue = 2.25;
        assertEquals(expectedValue,result);
    }

    @Test
    void avg2Test() {
        double result = ForumStats.avg2();
        double expectedValue = 2382.0;
        assertEquals(expectedValue,result);
    }
}