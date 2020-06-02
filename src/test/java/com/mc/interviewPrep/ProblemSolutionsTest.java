package com.mc.interviewPrep;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ProblemSolutionsTest {

    @Autowired
    ProblemSolutions problemSolutions;

    Stream arrayStream;

    @Test
    public void testArrayCreateStream() {
        Stream arrayStream = problemSolutions.arrayStream;
        long expectedCount = arrayStream.count();
        int intExpected = (int)expectedCount;
        assertEquals(intExpected, 4);
    }
}