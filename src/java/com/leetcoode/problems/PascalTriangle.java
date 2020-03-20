package com.leetcoode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        if (numRows == 1) {
            return Arrays.asList(Arrays.asList(1));
        }
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> preRow = pascalTriangle.get(i - 1);
            for (int j = 0; j < pascalTriangle.get(i - 1).size() - 1; j++) {
                curRow.add(preRow.get(j) + preRow.get(j + 1));
            }
            curRow.add(1);
            pascalTriangle.add(curRow);
        }
        return pascalTriangle;
    }
}
