package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClockTest {

    @Test
    public void shouldCreateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
        Clock firstClockBean = (Clock) context.getBean("clock", LocalDateTime.of(2022,10,22,18,00));
        assertNotNull(firstClockBean);
    }

    @Test
    public void shouldCreateDifferentClockBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
        Clock firstBean = (Clock) context.getBean("clock", LocalDateTime.of(2022,10,22,18,00));
        Clock secondBean = (Clock) context.getBean("clock", LocalDateTime.of(2022,10,21,19,00));
        Clock thirdBean = (Clock) context.getBean("clock", LocalDateTime.of(2022,10,20,20,00));
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }

}