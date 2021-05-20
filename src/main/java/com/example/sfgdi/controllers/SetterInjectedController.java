package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService setterGreetingServiceImpl;

    @Autowired
    public void setSetterGreetingServiceImpl(@Qualifier("setterGreetingServiceImpl") GreetingService setterGreetingServiceImpl) {
        this.setterGreetingServiceImpl = setterGreetingServiceImpl;
    }

    public String getGreeting() {
        return setterGreetingServiceImpl.sayGreeting();
    }
}
