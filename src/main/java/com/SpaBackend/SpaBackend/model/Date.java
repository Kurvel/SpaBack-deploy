package com.SpaBackend.SpaBackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Dates")
public class Date {
    @Id
    private String id;
    private String date;
    private String name;
    private String option;
    private String timeOption;
    
    public Date(String id, String date, String name, String option, String timeOption) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.option = option;
        this.timeOption = timeOption;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getTimeOption() {
        return timeOption;
    }

    public void setTimeOption(String timeOption) {
        this.timeOption = timeOption;
    }
    
    
}
