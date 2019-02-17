package com.kaushal.docketlistingservice.controllers;

import com.kaushal.docketlistingservice.entities.DocketDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/details")
public class DocketListingController {

    @GetMapping("/list")
    public List<DocketDetails> getDocketDetails() {

        List<DocketDetails> docketDetailsList = Arrays.asList(new DocketDetails(1l,"123ABC"),
                new DocketDetails(2l,"456ABC"));

        return docketDetailsList;
    }
}
