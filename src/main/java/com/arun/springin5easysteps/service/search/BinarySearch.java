package com.arun.springin5easysteps.service.search;

import com.arun.springin5easysteps.service.sort.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch implements SearchAlgorithm {

    @Autowired
    @Qualifier("BubbleSort")
    private SortAlgorithm sortAlgorithm;

    @Override
    public int search(int[] numbers, int numberToBeSearched) {
        int[] sortedNumber = sortAlgorithm.sort(numbers);
        return binarySearchAlgo(sortedNumber);
    }

    /**
     * @param sortedNumber
     * @return TODO Logic of Binary search
     */
    private int binarySearchAlgo(int[] sortedNumber) {
        int number = 0;
        /**
         * Logic for Binary Search TODO
         */
        return number;
    }
}
