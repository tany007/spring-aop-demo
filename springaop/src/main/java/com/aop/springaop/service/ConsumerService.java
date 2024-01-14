package com.aop.springaop.service;

import com.aop.springaop.aspect.Log;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Log
    public void consumer(){
        System.out.println("In consumer Service");
    }
}
