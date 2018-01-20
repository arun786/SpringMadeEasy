package com.arun.springin5easysteps.util;

public class ArrayBuilder {

    public static int[] getArrayBuilder() {
        int[] builder = new int[10];
        for (int i = 0; i < builder.length; i++) {
            builder[i] = (int) (Math.random() * 100);
        }
        return builder;
    }
}
