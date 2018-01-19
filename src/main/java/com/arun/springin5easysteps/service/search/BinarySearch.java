package com.arun.springin5easysteps.service.search;

import com.arun.springin5easysteps.service.sort.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch implements SearchAlgorithm {

    private Logger logger = LoggerFactory.getLogger(BinarySearch.class);

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
        logger.info("Binary Search Algo is called...");
        return number;
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("Post Construct is called...");
    }

    @PreDestroy
    private void preDestroy() {
        logger.info("This is called to remove any resource before the instance is being removed...");
    }


}
