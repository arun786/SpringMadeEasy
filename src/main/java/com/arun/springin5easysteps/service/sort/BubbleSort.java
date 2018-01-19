package com.arun.springin5easysteps.service.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("BubbleSort")
public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}
