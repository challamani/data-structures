package com.practice.java.ds.service;

import java.util.List;

public interface Sort<T> {
    List<T> sort(List<T> input);
    List<String> getMetadata();
}
