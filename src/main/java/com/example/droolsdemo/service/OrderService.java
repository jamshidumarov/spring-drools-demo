package com.example.droolsdemo.service;

import com.example.droolsdemo.model.Order;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KieSession kieSession;
    public HttpEntity<?> getDiscount(Order order){
        kieSession.insert(order);
        kieSession.fireAllRules();
        return ResponseEntity.ok(order);
    }
}
