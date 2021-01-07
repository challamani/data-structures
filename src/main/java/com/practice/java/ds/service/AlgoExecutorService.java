package com.practice.java.ds.service;

import com.practice.java.ds.domain.Response;
import com.practice.java.ds.domain.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AlgoExecutorService {

    @Autowired
    Map<String,Sort> stringSortMap;

    public Response doSorting(Request request) {
        Response response = new Response();
        List<Integer> result = stringSortMap.get(request.getValue()).sort(request.getInput());
        response.setOutput(result);
        response.setInput(request.getInput());
        response.setMetadata(stringSortMap.get(request.getValue()).getMetadata());
        return response;
    }
}
