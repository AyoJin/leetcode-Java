package com.leetcoode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }
        List<Integer> preLevel = Arrays.asList(1, 1);
        List<Integer> curLevel = new ArrayList<>();
        for (int i = 2; i <= rowIndex; i++) {
            curLevel = new ArrayList<>();
            curLevel.add(1);
            for (int j = 0; j < preLevel.size() - 1; j++) {
                curLevel.add(preLevel.get(j) + preLevel.get(j + 1));
            }
            curLevel.add(1);
            preLevel = curLevel;
        }
        return curLevel;
    }
}
