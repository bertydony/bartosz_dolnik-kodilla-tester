package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
    public class CalculatorTest {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    double a = 10.5;
    double b = 8.0;

    @Test
    public void shouldAdd() {
        double sum = bean.add(a, b);
        assertEquals(18.5, sum);
    }

    @Test
    public void shouldSubtract() {
        double sub = bean.subtract(a, b);
        assertEquals(2.5, sub);
    }

    @Test
    public void shouldMultiply() {
        double mul = bean.multiply(a, b);
        assertEquals(84, mul);
    }

    @Test
    public void shouldDivide() {
        double div = bean.divide(a, b);
        assertEquals(1.3, div,0.1);
    }
}