package com.practice.java.ds.domain;

import lombok.Data;

import java.util.List;

@Data
public class Response extends BaseResponse {
    private List<Integer> input;
    private List<Integer> output;

    public List<Integer> getInput() {
        return input;
    }

    public void setInput(List<Integer> input) {
        this.input = input;
    }

    public List<Integer> getOutput() {
        return output;
    }

    public void setOutput(List<Integer> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "Response{" +
                "input=" + input +
                ", output=" + output +
                '}';
    }


}
