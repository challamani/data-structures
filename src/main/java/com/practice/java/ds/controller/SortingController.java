package com.practice.java.ds.controller;

import com.practice.java.ds.domain.Response;
import com.practice.java.ds.domain.Request;
import com.practice.java.ds.service.AlgoExecutorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class SortingController {

    @Autowired
    AlgoExecutorService algoExecutorService;

    @RequestMapping(value = {"/sorting/{type}/{order}"},method = RequestMethod.POST, produces = {"application/json"})
    public Response doSorting(@PathVariable String type , @PathVariable String order, @RequestBody Request request){
        request.setType("sorting");
        request.setOrder(order);
        request.setValue(type);
        return algoExecutorService.doSorting(request);
    }

}
