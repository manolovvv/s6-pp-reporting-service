package com.reportingservice.reporting.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReportingController {

    private final KafkaTemplate<String, String> template;

    @GetMapping(value = "/")
    public String test(){
        try {
            template.send("reporting", "1", "asd");
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
        return "asd";
    }
}
