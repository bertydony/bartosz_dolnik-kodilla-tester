package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class SkypeMessageService {

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype";
    }
}
