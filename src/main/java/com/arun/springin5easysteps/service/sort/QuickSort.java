package com.arun.springin5easysteps.service.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Qualifier("QuickSort")
public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}
