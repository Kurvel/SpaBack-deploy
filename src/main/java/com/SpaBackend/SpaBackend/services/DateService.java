package com.SpaBackend.SpaBackend.services;

import java.util.List;


import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.SpaBackend.SpaBackend.model.Date;

@Service
public class DateService {
    
    private final MongoOperations mongoOperations;

    public DateService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public List<Date> getDates() {
        return mongoOperations.findAll(Date.class);
    }

    public Date getDate(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoOperations.findOne(query, Date.class);
    }

    public Date addDate(Date date) {
        return mongoOperations.insert(date);
    }

    public Date editDate(String id, Date date) {
        date.setId(id);
        return mongoOperations.save(date);
    }

    public void deleteDate(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        mongoOperations.remove(query, Date.class);
    }
}
