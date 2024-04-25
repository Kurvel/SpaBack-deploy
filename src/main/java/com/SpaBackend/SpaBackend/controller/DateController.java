package com.SpaBackend.SpaBackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.SpaBackend.SpaBackend.model.Date;
import com.SpaBackend.SpaBackend.services.DateService;


@CrossOrigin
@RestController
public class DateController {
    
    private DateService dateService;

    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping
    public String getRoot() {
        return "Hello World!";
    }

    @GetMapping("dates")
    public List<Date> getDates() {
        return dateService.getDates();
    }

    @GetMapping("/date/{id}")
    public Date getDate(@PathVariable String id) {
        return dateService.getDate(id);
    }

    @PostMapping("/date")
    public Date addDate(@RequestBody Date date) {
        return dateService.addDate(date);
    }

    @PatchMapping("/date/{id}")
    public Date editDate(@PathVariable String id, @RequestBody Date date) {
        return dateService.editDate(id, date);   
    }

    @DeleteMapping("/date/{id}")
    public String deleteDate(@PathVariable String id) {
        dateService.deleteDate(id);
        return "{'message': 'Date with id " + id + " has been deleted'}";
    }
    
}
