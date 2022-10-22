package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTest {
@Test
    public void isAirportInUseTest() throws AirportNotFoundException{
    AirportRepository airportRepository = new AirportRepository();
    boolean isWarsawInUse = airportRepository.isAirPortInUse("Warsaw");
    assertTrue(isWarsawInUse);
}

    @Test
    public void isAirportInUse_withException(){
    AirportRepository airportRepository = new AirportRepository();
    assertThrows(AirportNotFoundException.class, ()  -> airportRepository.isAirPortInUse("Vienna"));
    }
}