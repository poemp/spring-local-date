package org.poem.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class DateController {


    @RequestMapping("/getDate/{localDate}")
    public String getDate(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable LocalDate localDate){
        return  localDate.toString();
    }

    @RequestMapping("/getDateTime/{dateTime}")
    public String getDateTime(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @PathVariable LocalTime localTime){
        return  localTime.toString();
    }
}
