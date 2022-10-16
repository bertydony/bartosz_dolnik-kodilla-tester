package com.kodilla.parametrized_tests.homework;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class ShopTest {

    Shop shop = new Shop();
    Order drone = new Order(3999.99, LocalDate.of(2022, 1, 22), "Marcin");
    Order laptop = new Order(2500.00, LocalDate.of(2022, 2, 20), "Grzesiek");
    Order computer = new Order(5500.00, LocalDate.of(2022, 4, 10), "Lucek");
    Order speakers = new Order(255.00, LocalDate.of(2022, 4, 13), "Michal");
    Order desk = new Order(800.00, LocalDate.of(2022, 4, 15), "Kasia");
    Order chair = new Order(450.00, LocalDate.of(2022, 5, 2), "Zaneta");
    Order tv = new Order(3000, LocalDate.of(2022, 12, 30), "Amelia");


    @Test
    public void shouldAddObjectsToShop() {
        int result = shop.getSize();
        assertEquals(7, result);
    }

    @Test
    public void shouldReturnCorrectDates() {
        int result = shop.getOrdersByDate(LocalDate.of(2022,4,1), LocalDate.of(2022,4,29)).size();
        assertEquals(3,result);
    }

    @Test
    public void shouldReturnNullWhenValuesInDateRangeAreEmpty() {
        shop.clear();
        assertNull(shop.getOrdersByDate(LocalDate.of(2021,4,1), LocalDate.of(2021,4,29)));
    }

    @Test
    public void shouldReturnCorrectMinMaxValues(){
        int result = shop.getOrdersByMinMax(500, 4000).size();
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnNullWhenMinMaxValuesAreIncorrect(){
        shop.clear();
        assertNull(shop.getOrdersByMinMax(15,100));
    }

    @Test
    public void shouldSumAllOrderValues() {
        shop.clear();
        shop.addOrder(computer);
        shop.addOrder(laptop);
        assertEquals(8000,shop.sumOrders());
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(drone);
        shop.addOrder(laptop);
        shop.addOrder(computer);
        shop.addOrder(speakers);
        shop.addOrder(desk);
        shop.addOrder(chair);
        shop.addOrder(tv);
    }

    @AfterEach
    public void resetValues() {
    }
}