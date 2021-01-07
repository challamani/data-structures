package com.practice.java.ds.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BubbleSort implements Sort<Integer> {

    @Override
    public List<Integer> sort(List<Integer> input) {
        Integer[] inputValues = input.toArray(new Integer[0]);
        for (int i = 0; i < inputValues.length; i++) {
            for (int j = i + 1; j < inputValues.length; j++) {
                if (inputValues[i] > inputValues[j]) {
                    int tempValue = inputValues[j];
                    inputValues[j] = inputValues[i];
                    inputValues[i] = tempValue;
                }
            }
        }
        return Arrays.asList(inputValues);
    }

    @Override
    public List<String> getMetadata() {
        return Arrays.asList("Not found!");
    }
}
