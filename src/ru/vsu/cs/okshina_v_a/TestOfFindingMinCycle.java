package ru.vsu.cs.okshina_v_a;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

@RunWith(Parameterized.class)
public class TestOfFindingMinCycle {
    private final int n;
    private final int expectedResult;

    public TestOfFindingMinCycle(int n, int expectedResult) {
        this.n = n;
        this.expectedResult = expectedResult;
    }



    @Parameterized.Parameters
    public static List<Object[]> cases() {
        return Arrays.asList(new Object[][]{
                {7, 4},
        });
    }

    @Test
    public void testOfFinding() throws Exception {
        for (int i = 0; i < MinCycleSearch.N; i++)
            MinCycleSearch.graph[i] = new Vector<>();

        MinCycleSearch.addEdge(0, 6);
        MinCycleSearch.addEdge(0, 5);
        MinCycleSearch.addEdge(5, 1);
        MinCycleSearch.addEdge(1, 6);
        MinCycleSearch.addEdge(2, 6);
        MinCycleSearch.addEdge(2, 3);
        MinCycleSearch.addEdge(3, 4);
        MinCycleSearch.addEdge(4, 1);

        int actualResult = MinCycleSearch.findShortestCycle(n);
        Assert.assertEquals(expectedResult, actualResult);
    }
}