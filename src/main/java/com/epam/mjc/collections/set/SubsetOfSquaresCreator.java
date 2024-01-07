package com.epam.mjc.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        sourceList = sourceList.stream().map(number -> number * number).collect(Collectors.toList());
        TreeSet<Integer> set = new TreeSet<>(sourceList);
        return set.subSet(lowerBound, upperBound + 1);
    }
}
