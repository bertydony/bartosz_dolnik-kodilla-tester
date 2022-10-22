package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirPortInUse("Vienna");
            System.out.println("Vienna status: "+ isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry nie ma takiego lotniska");
        } finally {
            System.out.println("Thank u for using Kodilla airlines");
        }
    }
}
