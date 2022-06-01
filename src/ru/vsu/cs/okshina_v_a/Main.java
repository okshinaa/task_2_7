package ru.vsu.cs.okshina_v_a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < MinCycleSearch.N; i++)
            MinCycleSearch.graph[i] = new Vector<>();

        int n = 7;

        MinCycleSearch.addEdge(0, 6);
        MinCycleSearch.addEdge(0, 5);
        MinCycleSearch.addEdge(5, 1);
        MinCycleSearch.addEdge(1, 6);
        MinCycleSearch.addEdge(2, 6);
        MinCycleSearch.addEdge(2, 3);
        MinCycleSearch.addEdge(3, 4);
        MinCycleSearch.addEdge(4, 1);


        System.out.println("Длина кратчайшего цикла = " + MinCycleSearch.findShortestCycle(n));
    }
}
