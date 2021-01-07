package com.practice.java.ds.domain;

import lombok.Data;

import java.util.List;

@Data
public class Request extends BaseRequest {
    private List<Integer> input;
    private String order;

    @Override
    public String toString() {
        return "Request{" +
                "input=" + input +
                ", order='" + order + '\'' +
                '}';
    }

    public List<Integer> getInput() {
        return input;
    }

    public void setInput(List<Integer> input) {
        this.input = input;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
