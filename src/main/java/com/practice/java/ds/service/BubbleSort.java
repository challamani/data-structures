package com.practice.java.ds.service;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
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
    public Map<String, String> getMetadata() {
        return ImmutableMap.of("metadata","Not found!");
    }

}
